package tn.esb.lmad.flighPlannerAPI.Domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@Entity

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // the foreign key is missing : the flight booked by the passenger
    private String passengerName;
    private String passengerContactDetails;
    private BigDecimal totalPrice;
    private String paymentMethod;
    private String billingAddress;

    public Booking(String passengerName, String passengerContactDetails, BigDecimal totalPrice, String paymentMethod, String billingAddress) {
        this.passengerName = passengerName;
        this.passengerContactDetails = passengerContactDetails;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.billingAddress = billingAddress;
    }
}
