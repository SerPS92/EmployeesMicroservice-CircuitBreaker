package com.example.EmployeesMicroserviceCircuitBreaker.Service;

import com.example.EmployeesMicroserviceCircuitBreaker.Model.Employee;

import java.util.List;

public interface IEmployeesService {

    List<Employee> employees();
}
