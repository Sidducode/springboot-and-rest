package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	Map<Long, Student> students = new HashMap<>();

	long currentId = 128;

	public StudentServiceImpl() {
		init();
	}

	void init() {

		Student student = new Student();
		student.setId(currentId);
		student.setName("edc");
		students.put(student.getId(), student);

	}

	@Override
	public List<Student> getStudents() {

		Collection<Student> result = students.values();
		List<Student> response = new ArrayList<>(result);

		return response;
	}

	@Override
	public Student getStudent(long id) {
		
		return students.get(id);
	}

	

}
