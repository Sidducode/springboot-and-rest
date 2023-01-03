package com.example.demo;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.example.demo.entity.Employee;

@Path("/employeeservice")
public interface EmployeeService {
	
	
     @Path("/getallemployees")
     @GET
     public List<Employee> getEmplyees();
     
     @Path("/getemployee/{id}")
     @GET
     Employee  getoneEmployee(@PathParam(value="id") int id);
     
     @Path("/createEmployee")
     @POST
     Response createEmployee(Employee employee);
     
     @Path("/updateEmployee")
     @PUT
     Response updateEmployee(Employee employee);
     
     @Path("/deleteEmployee/{id}")
     @DELETE
     Response deleteEmployee(@PathParam(value="id") int id);
     
     
     
	
}
