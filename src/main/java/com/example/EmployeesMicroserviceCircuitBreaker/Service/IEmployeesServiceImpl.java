package com.example.EmployeesMicroserviceCircuitBreaker.Service;

import com.example.EmployeesMicroserviceCircuitBreaker.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class IEmployeesServiceImpl implements IEmployeesService{

    List<Employee> employees = Arrays.asList(
            new Employee("emp1", 11, "developer"),
            new Employee("emp2", 22, "project manager"),
            new Employee("emp3", 33, "recruiter"),
            new Employee("emp4", 44, "developer"));
    @Override
    public List<Employee> employees() {
        return employees;
    }
}
