package com.example.demo;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

import com.example.demo.model.Patient;
@Consumes("application/xml,application/x-www-form-urlencoded")
@Produces("application/xml,application/json") 
@Path("/patientservice")
public interface PatientService {
	
	@Path("/patients")
	@GET
	List<Patient> getPatients(@QueryParam("start") int start,@QueryParam("size")int size);

	@Path("/patient")
	@POST
	void addPatient(@FormParam("firstname") String firstname,@FormParam("lastname") String lastname,
			@HeaderParam("agent") String agent, @Context HttpHeaders headers);
	
	
}
