package tn.esb.lmad.flighPlannerAPI.Domains;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@Entity // JPA annotation to make this object ready for storage in a JPA-based data store
public class Airport {
    @Id // jpa annotation to specify the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer airportCode;
    private String name;
    private String city;
    private String timeZone;
    private int runways;
    private String country;
    @ManyToMany
    @JoinTable(name = "airport_flight",
            joinColumns = @JoinColumn(name = "airport_code"),
            inverseJoinColumns = @JoinColumn(name = "flight_id"))
    Set<Flight> flights = new HashSet<>();

    public Airport(String name, String location, String timeZone, int runways, String country) {
        this.name = name;
        this.city = location;
        this.timeZone = timeZone;
        this.runways = runways;
        this.country = country;
    }
}
