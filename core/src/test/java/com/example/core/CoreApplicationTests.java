package com.example.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.core.dao.PaymentDao;
import com.example.core.services.PaymentServiceImpl;
import com.example.core.services.PaymentServices;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentServices paymentServices;
	@Autowired
	PaymentServiceImpl  paymentserImpl;
	
	
	@Test
	public void testDepenServ() {
		assertNotNull(paymentServices);
	}
	
	@Test
	public void testDepenDao() {
		assertNotNull(paymentserImpl);
	}

}
