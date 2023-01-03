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
import com.example.demo.patientRepo.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService {

	PatientRepo patientRepo;
	
	@Override
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient getPatient(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response createPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deletePAtient(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
