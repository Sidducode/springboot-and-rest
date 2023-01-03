package com.example.demo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Student;

@SpringBootTest
class SpringBootRestDb1ApplicationTests {

	@Test
	public void testGetProduct() {
		
		RestTemplate restTemp = new RestTemplate();
		
		Student student = restTemp.getForObject("http://localhost:8196/springwebmvc1/student/1", Student.class);
		
		assertNotNull(student);
	}
	
	
	@Test
	public void testcreateProduct() {
		
		RestTemplate restTemp = new RestTemplate();
		
		Student std= new Student();
		std.setName("kkk");
		std.setPlace("edcedc");
		
		Student newpr= restTemp.postForObject("http://localhost:8196/springwebmvc1/student/1",std,Student.class);
		assertNotNull(newpr.getId());
		assertEquals("kkk", newpr.getName());
	}
	
	
	@Test
	public void testupdateProduct() {
		
		RestTemplate restTemp = new RestTemplate();
		
		Student std= new Student();
		std.setPlace("okm");
		Student pr= restTemp.postForObject("http://localhost:8196/springwebmvc1/student/  ",std,Student.class);
		assertNotNull(pr);
		assertEquals("sss", pr.getName());
	}
	
}
