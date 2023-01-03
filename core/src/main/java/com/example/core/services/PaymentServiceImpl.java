package com.example.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.core.dao.PaymentDao;

@Service
public class PaymentServiceImpl implements PaymentServices {

	@Autowired
	private PaymentDao paymentDao;

	public PaymentDao getPaymentDao() {
		return paymentDao;
	}

	public void setPaymentDao(PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}
	
	
}
