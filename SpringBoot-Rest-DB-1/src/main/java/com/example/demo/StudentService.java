package com.example.demo;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.example.demo.entity.Student;


@Path("/studentservice")
public interface StudentService {
	
	
	@Path("/getalldata")
	@GET
	public List<Student> getAllData();
	
	@Path("/getsingledata/{id}")
	@GET
	public void getStudent(@PathParam(value = "id")int id);
	
	@Path("/createdata")
	@POST
	public Student createStudentData(Student student);
	
	@Path("/updatedata")
	@PUT
	public Student updateStudentData(Student student);
	
	@Path("/deletedata/{id}")
	@DELETE
	public void deleteStudentData(@PathParam(value = "id")int id);
	
	

}
