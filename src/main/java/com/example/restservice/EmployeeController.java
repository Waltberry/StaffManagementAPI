package com.example.restservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeManager.getEmployees().getAllEmployees();
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee newEmployee) {
        employeeManager.addEmployee(newEmployee);
    }
}
