package tn.esb.lmad.flighPlannerAPI.Domains;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seat {
    @Id
    private Long id;
    private String seatNumbers;
    private String seatClass;
    private boolean seatAvailability;
    private BigDecimal seatPitch;
    private BigDecimal recline;
    private String entertainmentOptions;

}
