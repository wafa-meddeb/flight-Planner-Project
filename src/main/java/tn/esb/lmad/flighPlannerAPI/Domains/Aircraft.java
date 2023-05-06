package tn.esb.lmad.flighPlannerAPI.Domains;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.event.spi.PreInsertEvent;
import tn.esb.lmad.flighPlannerAPI.Enumerations.AircraftModel;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@Entity // JPA annotation to make this object ready for storage in a JPA-based data store
        // the database is a relational one
public class Aircraft {
    @Id // jpa annotation to specify the primary key of an entity
    @EqualsAndHashCode.Include // to include this field in the equals and hashcode methods
    private String code;
    @Enumerated(EnumType.STRING)
    private AircraftModel model;
    private int maxPassengerCapacity;
    private int range;
    private BigDecimal fuelCapacity;

    @ManyToOne
    @JoinColumn(name = "flight")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;


    public Aircraft(AircraftModel model, int maxPassengerCapacity, int range, BigDecimal fuelCapacity) {
        this.model = model;
        this.maxPassengerCapacity = maxPassengerCapacity;
        this.range = range;
        this.fuelCapacity = fuelCapacity;
    }


}
