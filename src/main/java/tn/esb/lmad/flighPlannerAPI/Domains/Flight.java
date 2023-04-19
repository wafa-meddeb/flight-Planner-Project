package tn.esb.lmad.flighPlannerAPI.Domains;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import tn.esb.lmad.flighPlannerAPI.Enumerations.FlightStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "airlines")
@Entity
public class Flight {
    @Id
    //auto increment start from 1 and increment by 1
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightNum;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime departureTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime arrivalTime;
    private BigDecimal price;
    private float duration;
    private int distance;
    private boolean isDirect;
    @Enumerated(EnumType.STRING)
    @Column(length = 10,columnDefinition = "varchar(10) default 'SCHEDULED'")
    private FlightStatus status;
    //specify the relationship between the entity flight and airport (many to many)
    @ManyToMany(mappedBy = "flights")
    Set<Airport> airports = new HashSet<>();

    @OneToMany(mappedBy = "flights")
    private Set<Aircraft> aircrafts = new HashSet<>();

    @OneToMany(mappedBy = "flights")
    private Set<Seat> seats = new HashSet<>();

    @OneToMany(mappedBy = "flights")
    private Set<Booking> bookings = new HashSet<>();

    public Flight(LocalDateTime departureTime, LocalDateTime arrivalTime, float duration, int distance, boolean isDirect) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
        this.distance = distance;
        this.isDirect = isDirect;
    }
}
