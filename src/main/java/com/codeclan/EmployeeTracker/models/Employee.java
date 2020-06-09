package com.codeclan.EmployeeTracker.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column(name = "employee_number")
    private int employeeNumber;

    @Column
    private String email;

    @JsonIgnoreProperties("employees")
    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @ManyToMany
    @JoinTable(
            name = "employee_projects",
            joinColumns = {
                    @JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = { @JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false
            )})
    private List<Project> projects;

    public Employee(String name, int age, int employeeNumber, String email, Department department) {
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
        this.department = department;
        this.projects = new ArrayList<>();
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project){
        this.projects.add(project);
    }
}
