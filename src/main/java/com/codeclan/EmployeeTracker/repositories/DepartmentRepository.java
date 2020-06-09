package com.codeclan.EmployeeTracker.repositories;
import com.codeclan.EmployeeTracker.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
