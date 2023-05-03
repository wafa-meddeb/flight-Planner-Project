package tn.esb.lmad.flighPlannerAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esb.lmad.flighPlannerAPI.Domains.EmployeeContact;
@Repository
public interface EmployeeContactRepository extends JpaRepository<EmployeeContact,Integer> {
}
