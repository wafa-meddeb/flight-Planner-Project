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

public class Booking {
    @Id
    private String id;
    // the foreign key is missing : the flight booked by the passenger
    private String passengerName;
    private String passengerContactDetails;
    private BigDecimal totalPrice;
    private String paymentMethod;
    private String billingAddress;


}
