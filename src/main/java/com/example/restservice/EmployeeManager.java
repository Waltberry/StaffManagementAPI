package com.example.restservice;

public class EmployeeManager {
    private Employees employees = new Employees();

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}
