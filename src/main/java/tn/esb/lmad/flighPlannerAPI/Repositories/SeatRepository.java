package tn.esb.lmad.flighPlannerAPI.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esb.lmad.flighPlannerAPI.Domains.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}

