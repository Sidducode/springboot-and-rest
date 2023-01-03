package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

@SpringBootTest
class SpringMvcWeb1ApplicationTests {

	@Value("${private String baseURL}")
	private String baseURL;
	
	@Test
	public void testGetProduct() {
		
		
		
		RestTemplate restTemp = new RestTemplate();
		
		Student student = restTemp.getForObject(baseURL+"1", Student.class);
		
		assertNotNull(student);
	}
	
	
	@Test
	public void testcreateProduct() {
		
		RestTemplate restTemp = new RestTemplate();
		
		Student std= new Student();
		std.setName("rrr");
		std.setPlace("qqq");
		std.setSalary(1111);
		Student newpr= restTemp.postForObject("http://localhost:8196/springwebmvc1/createstudents/", std, Student.class);
		assertNotNull(newpr);
		assertNotNull(newpr.getId());
		assertEquals("rrr", newpr.getName());
	}
	
	
	@Test
	public void testupdateProduct() {
		
		RestTemplate restTemp = new RestTemplate();
		
		
		Student student = restTemp.getForObject("http://localhost:8196/springwebmvc1/student/1", Student.class);
		student.setSalary(5555);
		restTemp.put("http://localhost:8196/springwebmvc1/updatestudents/", student);
		
		
	}
	

}
