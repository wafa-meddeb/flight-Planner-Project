package tn.esb.lmad.flighPlannerAPI.Domains;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Time;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightNum;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Time flightDuration;
    private int distance;
    private boolean isDirect;

    public Flight(LocalDateTime departureTime, LocalDateTime arrivalTime, Time flightDuration, int distance, boolean isDirect) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightDuration = flightDuration;
        this.distance = distance;
        this.isDirect = isDirect;
    }
}
