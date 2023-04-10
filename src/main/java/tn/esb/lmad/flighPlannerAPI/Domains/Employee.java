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
public class Employee {
    @Id
    private int Id;
    private String name;
    private String jobTitle;
    private BigDecimal salary;



}
