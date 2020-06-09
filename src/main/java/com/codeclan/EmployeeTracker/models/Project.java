package com.codeclan.EmployeeTracker.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "number_of_days")
    private int numberOfDays;

    @JsonIgnoreProperties("projects")
    @ManyToMany
    @JoinTable(
            name = "employee_projects",
            joinColumns = { @JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = { @JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false
            )})
    private List<Employee> employees;

    public Project(String name, int numberOfDays) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.employees = new ArrayList<>();
    }

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

}
