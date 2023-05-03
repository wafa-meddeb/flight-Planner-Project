package tn.esb.lmad.flighPlannerAPI.Repositories;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esb.lmad.flighPlannerAPI.Domains.Airline;
@Repository
public interface AirlineRepository extends JpaRepository<Airline,String> {

}
