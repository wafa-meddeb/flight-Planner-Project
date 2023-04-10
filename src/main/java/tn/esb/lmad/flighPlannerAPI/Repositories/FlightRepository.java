package tn.esb.lmad.flighPlannerAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esb.lmad.flighPlannerAPI.Domains.Flight;

public interface FlightRepository extends JpaRepository<Flight,String> {
}
