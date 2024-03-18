package com.example.EmployeesMicroserviceCircuitBreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class EmployeesMicroserviceCircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesMicroserviceCircuitBreakerApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
