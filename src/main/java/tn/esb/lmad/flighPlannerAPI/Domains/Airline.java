package tn.esb.lmad.flighPlannerAPI.Domains;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString(exclude = {"logo"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor // generates a constructor with required fields (final fields and @NonNull fields)
//@AllArgsConstructor because the id is auto generated
@NoArgsConstructor
@Table(name = "airlines")
@Entity // JPA annotation to make this object ready for storage in a JPA-based data store
public class Airline {
    @Id // jpa annotation to specify the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment starts from 1 and increments by 1 (MySQL)
    private Integer id;
    private String airlineCode;
    @NonNull // the column is required
    //to specify the column name , length (and nullable by adding  nullable = false )
    @Column(unique = true, length = 70, name = "airline name")
    @EqualsAndHashCode.Include // to include this field in the equals and hashcode methods
    private String name;
    @NonNull
    private String contactInfo;
    private String headquarter;
    @Lob //to store large objects
    private byte[] logo;
    private int fleetSize;

    public Airline( @NonNull String name, @NonNull String contactInfo, String headquarter, byte[] logo, int fleetSize) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.headquarter = headquarter;
        this.logo = logo;
        this.fleetSize = fleetSize;
    }

    //specify the relationship between the entity airline and aircraft (1 to many)
    @OneToMany(mappedBy = "airline")
    private Set<Aircraft> aircrafts = new HashSet<>();
    

}
