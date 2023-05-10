package tn.esb.lmad.flighPlannerAPI.Domains;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    private String name;
    private String jobTitle;
    private BigDecimal salary;
    //specify the relationship between the entity emp and empContact (1 to 1)
    //mapped by is used to specify the field in the other entity that is the owner of the relationship(EmployeeContact)
    //the two sides of the relationship comes from the same relationship
    @OneToOne(mappedBy = "employee")
    @JoinColumn(name = "employeeContact_id")
    private EmployeeContact employeeContact;

    @ManyToOne
    @JoinColumn(name = "employees")
    private Airline airline;
    public Employee(String name, String jobTitle, BigDecimal salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }



}
