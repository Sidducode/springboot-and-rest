package com.example.demo;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.example.demo.model.Student;

@Path("/studentservice")
public interface StudentService {
	
	@Path("/students")
	@GET
	List<Student> getStudents();
	
	@Path("/student/{id}")
	@GET
	public  Student getStudent(@PathParam(value="id") long id);

}
