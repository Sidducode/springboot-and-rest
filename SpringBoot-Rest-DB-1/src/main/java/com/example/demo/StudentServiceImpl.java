package com.example.demo;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.jparepo.StudentRepos;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepos Studentrepos;
	
	
	@Override
	public List<Student> getAllData() {
		
		return Studentrepos.findAll();
	}

	@Override
	public void getStudent(int id) {
		Student student = Studentrepos.findById(id).get();
		Response.ok(student).build();
		
	}

	@Override
	public Student createStudentData(Student student) {
		   
		Student save = Studentrepos.save(student);
		Response build = Response.ok(save).build();
		return student;
	}

	@Override
	public Student updateStudentData(Student student) {
		Student save = Studentrepos.save(student);
		Response res=Response.ok(save).build();
		return student;
	}

	@Override
	public void deleteStudentData(int id) {
		
		Studentrepos.deleteById(id);
	}

}
