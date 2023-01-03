package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.School;

@Service
public class SchoolServiceImpl implements SchoolService {

	
	
	Map <Long,School> schools = new HashMap<>();
	
	long currentId=123;
	
	public SchoolServiceImpl() {
		init();
	}
	
	
	void init() {
		School school=new School();
		school.setId(currentId);
		school.setName("sidddd");
		school.setPlace("vemp");
		
		schools.put(school.getId(), school);
		
	}
	

	@Override
	public List<School> getSchool() {
		 Collection<School> res= schools.values();
		 List<School> response= new ArrayList<>(res);
		 return response;
	}
	
	

}
