package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    // Constructor
    public Employees() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employeeList.add(new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Product Manager"));
        employeeList.add(new Employee("3", "Michael", "Johnson", "michael.johnson@example.com", "Data Analyst"));
    }

    // Method to get all employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // Method to add a new employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
}
