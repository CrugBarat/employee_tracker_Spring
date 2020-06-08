package com.codeclan.EmployeeTracker;
import com.codeclan.EmployeeTracker.models.Employee;
import com.codeclan.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void canCreateAndSaveEmployee() {
		Employee employee = new Employee("Jane Doe", 35, 1234567, "jane_doe@email.com");
		employeeRepository.save(employee);
	}

}
