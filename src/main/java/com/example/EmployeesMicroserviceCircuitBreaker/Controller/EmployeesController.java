package com.example.EmployeesMicroserviceCircuitBreaker.Controller;

import com.example.EmployeesMicroserviceCircuitBreaker.Model.Employee;
import com.example.EmployeesMicroserviceCircuitBreaker.Service.IEmployeesService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeesController {

    private final IEmployeesService employeesService;

    public EmployeesController(IEmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping(value = "employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployees(){
        return employeesService.employees();
    }
}
