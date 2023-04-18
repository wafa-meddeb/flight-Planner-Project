package tn.esb.lmad.flighPlannerAPI.Domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@Entity


public class Passengers {
    @Id
    private int id;
    private String name;
    @Email
    private String email;
    private String phoneNumber;


}
