package tn.esb.lmad.flighPlannerAPI.Domains;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    @Column(name = "seat_number")
    private String seatNumbers;
    @NonNull
    @Column(name = "seat_class", columnDefinition = "varchar(255) default 'Economy'")
    private String seatClass;
    //@Column(name = "seat_price", precision = 7, scale = 2)
    @Digits(integer = 7, fraction = 2) //@column is the same as @Digits
    private BigDecimal seatPrice;
    private boolean seatAvailability;
    @Size(min = 25, max = 50)
    private BigDecimal seatPitch;
    @Size(min = 0, max = 45)
    private BigDecimal recline;
    private String entertainmentOptions;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    public Seat(@NonNull String seatNumbers, @NonNull String seatClass, BigDecimal seatPrice, boolean seatAvailability, BigDecimal seatPitch, BigDecimal recline, String entertainmentOptions) {
        this.seatNumbers = seatNumbers;
        this.seatClass = seatClass;
        this.seatPrice = seatPrice;
        this.seatAvailability = seatAvailability;
        this.seatPitch = seatPitch;
        this.recline = recline;
        this.entertainmentOptions = entertainmentOptions;
    }
}
