package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	Map <Long , Patient> patients= new HashMap<>();
	
	long currentId=123;
	
	
	
	public PatientServiceImpl() {
		init();
	}
	
	
	void init() {
		Patient patient = new Patient();
		patient.setId(currentId);
		patient.setName("John");
		patients.put(patient.getId(),patient);
		
	}

	@Override
	public List<Patient> getPatients() {
		 Collection<Patient> res= patients.values();
		 List<Patient> response= new ArrayList<>(res);
		 return response;
	}

	
	@Override
	public Patient getPatient(Long id) {
		
		if(patients.get(id)==null) {
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}
		return patients.get(id);
	}


	@Override
	public Response createPatient(Patient patient) {

		patient.setId(++currentId);
		patients.put(patient.getId(),patient);
		return Response.ok(patient).build();
	}


	@Override
	public Response updatePatient(Patient patient) {

     Patient currentpatient = patients.get(patient.getId());
     
     Response response;
     
     if(currentpatient !=null) {
    	 patients.put(patient.getId(), patient);
    	 response= Response.ok().build();
     } else {
    	 throw new PatientBusinessException();
     }
		return response;
	}


	@Override
	public Response deletePAtient(Long id) {

       Patient patient= patients.get(id);
       
       Response response;
       
       if(patient!=null) {
    	   patients.remove(id);
    	   response = Response.ok().build();
       }else {
      	 response = Response.notModified().build();
       }
		
		return response;
	}
}
