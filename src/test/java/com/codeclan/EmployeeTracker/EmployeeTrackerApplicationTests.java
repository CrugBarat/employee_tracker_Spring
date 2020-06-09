package com.codeclan.EmployeeTracker;
import com.codeclan.EmployeeTracker.models.Department;
import com.codeclan.EmployeeTracker.models.Employee;
import com.codeclan.EmployeeTracker.models.Project;
import com.codeclan.EmployeeTracker.repositories.DepartmentRepository;
import com.codeclan.EmployeeTracker.repositories.EmployeeRepository;
import com.codeclan.EmployeeTracker.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeTrackerApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("Finance");
		departmentRepository.save(department);

		Employee employee = new Employee("Jane Doe", 30, 127733, "jane_doe@email.com", department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeesAndProjects() {
		Department department = new Department("Finance");
		departmentRepository.save(department);

		Employee employee = new Employee("Jane Doe", 30, 127733, "jane_doe@email.com", department);
		employeeRepository.save(employee);

		Project project = new Project("Public Housing Crisis", 14);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
