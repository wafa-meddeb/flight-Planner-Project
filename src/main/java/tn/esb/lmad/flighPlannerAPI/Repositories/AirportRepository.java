package tn.esb.lmad.flighPlannerAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esb.lmad.flighPlannerAPI.Domains.Airport;

public interface AirportRepository extends JpaRepository<Airport,String> {
}
