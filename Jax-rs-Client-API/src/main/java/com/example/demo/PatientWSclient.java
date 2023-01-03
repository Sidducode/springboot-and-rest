package com.example.demo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rest.jax.model.Patient;

public class PatientWSclient {

	
	private static final String PATIENT ="/patients";
	private static final String PATIENT_URL = "http://localhost:8196/RestExamp1/services/patientservice";

	public static void main(String[] args) {

		Client client= ClientBuilder.newClient();
		
		WebTarget target = client.target(PATIENT_URL).path("/patients").path("/{id}").resolveTemplate("id", 123);
		
		Builder request = target.request();
		
		Patient patient = request.get(Patient.class);
		
		System.out.println(patient.getId());
		System.out.println(patient.getName());
		
		patient.setName("sidd");
		WebTarget puttarget = client.target(PATIENT_URL).path("/patients");
		Response updateresp=puttarget.request().put(Entity.entity(patient, MediaType.APPLICATION_XML));
		
		System.out.println(updateresp.getStatus());
		updateresp.close();
		
		
		Patient newPatient=new Patient();
		newPatient.setName("www");
		WebTarget posttarget=client.target(PATIENT_URL).path(PATIENT);
		
		Patient createdPatient = posttarget.request().post(Entity.entity(patient, MediaType.APPLICATION_XML),
				Patient.class);
		System.out.println(createdPatient.getId());
		
		
		client.close();
	}

}
