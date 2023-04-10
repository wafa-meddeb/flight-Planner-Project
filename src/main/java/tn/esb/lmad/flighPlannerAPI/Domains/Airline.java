package tn.esb.lmad.flighPlannerAPI.Domains;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "airlines")
@Entity // JPA annotation to make this object ready for storage in a JPA-based data store
public class Airline {
    @Id // jpa annotation to specify the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment starts from 1 and increments by 1 (MySQL)
    private Integer id;
    private String airlineCode;
    @NonNull
    //to specify the column name , length (and nullable by adding  nullable = false )
    @Column(unique = true, length = 70, name = "airline name")
    private String name;
    private String contactInfo;
    private String headquarter;
    @Lob //to store large objects
    private byte[] logo;
    private int fleetSize;

}
