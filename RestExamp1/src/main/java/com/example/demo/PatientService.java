package com.example.demo;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.example.demo.model.Patient;
@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/patientservice")
public interface PatientService {
	
	@Path("/patients")
	@GET
	List<Patient> getPatients();
	
	
	@Path("/patient")
	@POST
	long addProduct(Patient patient);

}
