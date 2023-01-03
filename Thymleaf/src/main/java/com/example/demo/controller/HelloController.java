package com.example.demo.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return null;
		
	}
	
	@RequestMapping("/sendData")
	public ModelAndView sendData() {
		ModelAndView mav= new ModelAndView("data");
		mav.addObject("message", "tis time to code");
		return mav;
	}
	
	@RequestMapping("/getstudent")
	public ModelAndView getStudent() {
		ModelAndView mav= new ModelAndView("student");
		Student attributeValue = new Student();
		attributeValue.setId(1);
		attributeValue.setName("sss");
		mav.addObject("student", attributeValue);
		return mav;
	}
	
	
	@RequestMapping("/studentlist")
	public ModelAndView listofStudents() {
		ModelAndView mav= new ModelAndView("studentList");
		Student attributeValue1 = new Student();
		attributeValue1.setId(1);
		attributeValue1.setName("sss");
		Student attributeValue2 = new Student();
		attributeValue2.setId(2);
		attributeValue2.setName("ppp");
		
		List<Student> students = Arrays.asList(attributeValue1,attributeValue2);
		mav.addObject("students", students);
		return mav;
	}
	
	
	@RequestMapping("/studentForm")
	public ModelAndView getStudentForm() {
		ModelAndView mav= new ModelAndView("studentForm");
		Student student= new Student();
		mav.addObject("student", student);
		return mav;
	}
	
	@RequestMapping("/savestudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView mav= new ModelAndView("result");
		System.out.println(student.getId());
		System.out.println(student.getName());
		return mav;
	}
}
