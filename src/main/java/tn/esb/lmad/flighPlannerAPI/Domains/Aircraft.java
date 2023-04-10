package tn.esb.lmad.flighPlannerAPI.Domains;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.event.spi.PreInsertEvent;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity // JPA annotation to make this object ready for storage in a JPA-based data store
        // the database is a relational one
public class Aircraft {
    @Id // jpa annotation to specify the primary key of an entity
    private String id;
    @Enumerated(EnumType.STRING)
    private String model;
    private int maxPassengerCapacity;
    private int range;
    private BigDecimal fuelCapacity;
}
