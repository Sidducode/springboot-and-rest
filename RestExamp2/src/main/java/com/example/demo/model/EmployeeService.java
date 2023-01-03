package com.example.demo.model;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/employeeservice")
public interface EmployeeService {
	
	@Path("/employee")
	@GET
	List<Employee> getEmployee();

}
