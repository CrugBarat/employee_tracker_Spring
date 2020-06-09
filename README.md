# Employee Tracker

This exercise was tasked to me by CodeClan, Glasgow where I studied towards a PDA Level 8 in Professional Software Development. The exercise brief can be found below.

## Brief - Part 1

In this lab please use what you’ve already learned about Spring to create an entirely new Spring application that allows you to get the details of an employee.

**MVP**

Create a Spring Boot application for recording employee data that has:

- An Employee class that conforms to POJO and is annotated with fields name, age, employeeNumber and email
- A repository for doing database operations
- A RestController with one route for getting a JSON list of all Employees

---

## Part 2

In this lab, use what you’ve learned about one-to-many and many-to-many to create an application for a company to track their employees, departments and projects.

**MVP**

- A Department must have one-to-many with Employee: A Department has many Employees
- An Employee must have a many-to-many with a Project: Many Employees can be part of a Project and a Project can have many different Employees in it

Implement the following models to achieve the above relationships:

An Employee must:

- have a first name
- have last name
- have an employee number
- be able to be assigned to multiple projects

A Department must:

- have a name
- be able to add multiple employees

A Project must:

- have a name
- have a duration in number of days
- be able to add multiple employees
