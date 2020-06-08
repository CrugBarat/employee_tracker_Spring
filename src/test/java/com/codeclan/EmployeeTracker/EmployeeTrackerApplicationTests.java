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

	@Test
	public void canCreateAndSaveMulitpleEmployee() {
		Employee employee2 = new Employee("Lisa Johnstone", 21, 7348742, "lisa_j@email.com");
		Employee employee3 = new Employee("John Smith", 22, 7278238, "john_smith@email.com");
		Employee employee4 = new Employee("Henry Dickson", 43, 3928953, "henry_dicksen@email.com");
		Employee employee5 = new Employee("Jennifer Robertson", 27, 983923, "jenny_rob@email.com");
		Employee employee6 = new Employee("Susan Hughes", 38, 3292839, "susan_hughes@email.com");
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
		employeeRepository.save(employee5);
		employeeRepository.save(employee6);
	}

	@Test
	public void canDeleteById() {
		Employee employee7 = new Employee("Tony Jamieson", 29, 2878478, "tony_jamieson@email.com");
		employeeRepository.save(employee7);
		employeeRepository.deleteById(employee7.getId());
		assertThat(employeeRepository.count()).isEqualTo(18);
	}

}
