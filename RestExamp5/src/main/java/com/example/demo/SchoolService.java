package com.example.demo;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.example.demo.model.School;

@Path("/schoolservice")
public interface SchoolService {
	
	
	
	@Path("/school")
	@GET()
	List <School>  getSchool();
	

}
