package com.codeclan.EmployeeTracker.repositories;
import com.codeclan.EmployeeTracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
