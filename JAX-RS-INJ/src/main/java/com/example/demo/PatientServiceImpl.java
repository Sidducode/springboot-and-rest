package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

import org.springframework.stereotype.Service;
import com.example.demo.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	List<Patient> patients = new ArrayList<>();
	
	int currentId=125;
	
	@Override
	public List<Patient> getPatients(int start,int size) {
		System.out.println(start);
		System.out.println(size);
		return patients;
	}

	

	@Override
	public void addPatient(String firstname, String lastname , String agent,HttpHeaders headers) {
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(agent);
		
		
		MultivaluedMap<String, String> allheaders= headers.getRequestHeaders();
		
		Set<String> headerKeys= allheaders.keySet();
		
		for (String key:headerKeys) {
			System.out.println(key);
			System.out.println(headers.getHeaderString(key));
		}
		
		
		
   Map<String, Cookie> cookies= headers.getCookies();
		
		Set<String> cookiesKeys= allheaders.keySet();
		
		for (String eachkey:cookiesKeys) {
			System.out.println("************************");
			System.out.println(eachkey);
			System.out.println(cookies.get(eachkey));
		}
		
		
	}

	
}
