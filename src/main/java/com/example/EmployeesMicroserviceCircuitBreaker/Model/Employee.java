package com.example.EmployeesMicroserviceCircuitBreaker.Model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private String name;
    private int dni;
    private String position;
}
