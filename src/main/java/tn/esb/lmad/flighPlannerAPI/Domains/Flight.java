package tn.esb.lmad.flighPlannerAPI.Domains;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Flight {
    @Id
    private String flightNum;
}
