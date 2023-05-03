package tn.esb.lmad.flighPlannerAPI.Domains;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor(force = true)
//@AllArgsConstructor
@Entity // JPA annotation to make this object ready for storage in a JPA-based data store
public class Airport {
    @Id // jpa annotation to specify the primary key of an entity
    //auto increment starts from 1 and increments by 1
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    @NonNull
    private String name;
    @NonNull
    private String city;
    @NonNull
    private String country;
    private String timeZone;
    private String runways;
    //Specify the relationship between Airport and Flight (* to *)
    @ManyToMany
    //generate the association table using @JoinTable
    //we use @JoinTable because the association table has only 2 columns (airport_code and flight_code)
    //which are two foreign keys defining a composite primary key
    //The definition of the association table should be done in only one of the two entities not in both
    @JoinTable(name = "airport_flight",
            //the foreign key of the current entity is airport_code
            //referencedColumnName is optional
            //we have to specify the name of the primary key of the current entity in first place
            joinColumns = @JoinColumn(name = "airport_code", referencedColumnName = "code"),
            //the foreign key of the other entity is flight_code
            inverseJoinColumns = @JoinColumn(name = "flight_code")
    )
    private Set<Flight> flights=new HashSet<>();

    public Airport(String name, String location, String timeZone, String runways, String country) {
        this.name = name;
        this.city = location;
        this.timeZone = timeZone;
        this.runways = runways;
        this.country = country;
    }
}
