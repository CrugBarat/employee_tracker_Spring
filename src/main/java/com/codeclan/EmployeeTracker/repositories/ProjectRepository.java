package com.codeclan.EmployeeTracker.repositories;
import com.codeclan.EmployeeTracker.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
