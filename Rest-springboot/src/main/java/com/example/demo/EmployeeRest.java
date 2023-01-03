package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRest {

	@GetMapping("/employee")
	public Employee employeeData() {

		Employee emp= new Employee();
		
		emp.setId(1);
		emp.setName("sidd");
		
		return emp;

	}
	
	
	@PostMapping("/createemployee")
	public Employee SendemployeeData(@RequestBody Employee employee) {

		Employee emps= new Employee();
		
		emps.setId(1);
		emps.setName("sidd");
		
		return emps;

	}
}
