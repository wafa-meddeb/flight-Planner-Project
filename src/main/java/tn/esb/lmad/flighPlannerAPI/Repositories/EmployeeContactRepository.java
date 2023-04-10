package tn.esb.lmad.flighPlannerAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esb.lmad.flighPlannerAPI.Domains.EmployeeContact;

public interface EmployeeContactRepository extends JpaRepository<EmployeeContact,Integer> {
}
