package tn.esb.lmad.flighPlannerAPI.Domains;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class EmployeeContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String phoneNumber;
    private String mailingAddress;

    //specify the relationship between the entity emp and empContact (1 to 1)
    @OneToOne
    private Employee employee;

    public EmployeeContact(String email, String phoneNumber, String mailingAddresses) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.mailingAddress = mailingAddresses;
    }

}
