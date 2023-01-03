package com.example.demo;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.example.demo.model.Student;

@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/studentservice")
public interface StudentService{

	
	@Path("/student")
	@GET()
	List <Student>  getStudent();
	
	
}
