package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	private List<Patient> patients = new ArrayList<>();
	private long currentId=123;
	
	PatientServiceImpl(){
		
		Patient patient= new Patient();
		patient.setId(++currentId);
		patient.setName("siddilashaSidd");
		patients.add(patient);
	}

	@Override
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	@Override
	public long addProduct(Patient patient) {

		patient.setId(++currentId);
		patients.add(patient);
		System.out.println(patient.getId());
		System.out.println(patient.getName());
		long i=patient.getId();
		return i;
	}
	
	

	
}
