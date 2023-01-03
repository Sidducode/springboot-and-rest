package com.example.demo;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.example.demo.model.Student;

@Path("/studentservice")
public interface StudentService {
	
	@Path("/students")
	@GET
	List<Student> getStudent(Student student);

}
