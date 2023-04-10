package tn.esb.lmad.flighPlannerAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esb.lmad.flighPlannerAPI.Domains.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
