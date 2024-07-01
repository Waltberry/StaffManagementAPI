package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testEmployeeGetters() {
        Employee employee = new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer");

        assertEquals("1", employee.getId());
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("john.doe@example.com", employee.getEmail());
        assertEquals("Software Engineer", employee.getTitle());
    }

    @Test
    public void testToString() {
        Employee employee = new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer");
        String expected = "Employee: ID = 1, First Name = John, Last Name = Doe, email = john.doe@example.com, title = Software Engineer";
        
        assertEquals(expected, employee.toString());
    }
}
