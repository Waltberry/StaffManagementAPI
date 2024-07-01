package com.example.restservice;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeManager employeeManager;

    private Employee employee;

    @BeforeEach
    public void setup() {
        employee = new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer");
    }

    @Test
    public void testGetEmployees() throws Exception {
        when(employeeManager.getAllEmployees()).thenReturn(new Employees(Arrays.asList(employee)));

        mockMvc.perform(get("/employees/"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.employeeList[0].employee_id").value("1"))
            .andExpect(jsonPath("$.employeeList[0].first_name").value("John"));
    }

    @Test
    public void testAddEmployee() throws Exception {
        mockMvc.perform(post("/employees/")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{ \"employee_id\": \"1\", \"first_name\": \"John\", \"last_name\": \"Doe\", \"email\": \"john.doe@example.com\", \"title\": \"Software Engineer\" }"))
            .andExpect(status().isCreated());
    }
}
