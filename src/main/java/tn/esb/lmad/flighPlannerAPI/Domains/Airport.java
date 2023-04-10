package tn.esb.lmad.flighPlannerAPI.Domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity // JPA annotation to make this object ready for storage in a JPA-based data store
public class Airport {
    @Id // jpa annotation to specify the primary key of an entity
    private String airportCode;
    private String name;
    private String location;
    private String timeZone;
    private int runways;
    private String services;

}
