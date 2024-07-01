package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;
    private Employee employee;

    @BeforeEach
    public void setup() {
        employeeManager = new EmployeeManager();
        employee = new Employee("4", "Alice", "Wonderland", "alice.wonderland@example.com", "HR Manager");
    }

    @Test
    public void testGetAllEmployees() {
        Employees employees = employeeManager.getAllEmployees();
        assertEquals(3, employees.getEmployeeList().size());
    }

    @Test
    public void testAddEmployee() {
        employeeManager.addEmployee(employee);
        Employees employees = employeeManager.getAllEmployees();
        assertTrue(employees.getEmployeeList().contains(employee));
    }
}
