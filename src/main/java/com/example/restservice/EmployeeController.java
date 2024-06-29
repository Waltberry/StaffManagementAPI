package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeManager.getEmployees().getAllEmployees();
    }
}
