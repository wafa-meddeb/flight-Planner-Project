package tn.esb.lmad.flighPlannerAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esb.lmad.flighPlannerAPI.Domains.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
