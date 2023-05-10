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
@Table(name = "flights")
@Entity
public class Flight {
    @Id
    //auto increment start from 1 and increment by 1
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightNum;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime departureDateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime arrivalDateTime;
    private BigDecimal price;
    private float duration;
    private int distance;
    private boolean isDirect;
    @Enumerated(EnumType.STRING)
    @Column(length = 10,columnDefinition = "varchar(10) default 'SCHEDULED'")
    private FlightStatus status;
    //specify the relationship between the entity flight and airport (many to many)
    @ManyToMany(mappedBy = "flights")   //airport_id
    Set<Airport> airports=new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "aircraft_code")
    private Aircraft aircraft;

    @OneToMany(mappedBy = "flight")
    private Set<Seat> seats = new HashSet<>();

    @OneToMany(mappedBy = "flight")
    private Set<Booking> bookings = new HashSet<>();

    public Flight(LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, float duration, int distance, boolean isDirect) {
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.duration = duration;
        this.distance = distance;
        this.isDirect = isDirect;
    }
}
