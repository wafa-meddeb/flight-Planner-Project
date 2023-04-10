package tn.esb.lmad.flighPlannerAPI.Repositories;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esb.lmad.flighPlannerAPI.Domains.Airline;

public interface AirlineRepository extends JpaRepository<Airline,String> {

}
