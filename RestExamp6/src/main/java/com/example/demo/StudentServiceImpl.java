package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;


import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	Map<Integer,Student> students= new HashMap<>();
	
       int currentId=123;
	
       
	public StudentServiceImpl() {
		init();
	}
	
	void init() {
		Student student= new Student();
		student.setId(currentId);
		student.setName("sid");
		student.setPlace("vemp");
		students.put(student.getId(), student);
	}


	@Override
	public List<Student> getStudent() {

    Collection <Student> res=students.values();
    List<Student> response=new ArrayList<>(res);
		return response;
	}


	
	
}
