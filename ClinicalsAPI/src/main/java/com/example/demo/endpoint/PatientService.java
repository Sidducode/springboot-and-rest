package com.example.demo.endpoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Patient;
import com.example.demo.repos.reposPatient;


@Path("/api")
public class PatientService {
	
	@Autowired
	reposPatient repo;
	
	@Path("/create")
	@POST
	public Patient createPatient(Patient patient) {
		return repo.save(patient);
		
	}
	@Path("/getpatient")
	@GET
	public Patient getPatient(@PathParam("id") int id) {
		return repo.findById(id).get();
	}
	
	@Path("/getAllPatient")
	@GET
	public List<Patient> getPatients(){
		return repo.findAll();
		
	}

}
