package com.example.demo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	Map<Integer ,Employee> employees= new HashMap<>();
	
     int currentId=124;

	
	
	public EmployeeServiceImpl() {
		
		init();
	}
	
	
	void init() {
		Employee employee = new Employee();
		
		employee.setId(currentId);
		employee.setName("Sid");
		employee.setSalary(123654);
		
		employees.put(employee.getId(), employee);
	}

	@Override
	public List<Employee> getEmployee() {

		 Collection <Employee> result = employees.values();
		 List<Employee>  response = new ArrayList<>();
		 return response;
	}
}
