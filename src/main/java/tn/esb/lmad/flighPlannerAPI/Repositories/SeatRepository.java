package tn.esb.lmad.flighPlannerAPI.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esb.lmad.flighPlannerAPI.Domains.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}

