package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.klef.jfsd.exam.model.Customer;

public interface CustomerService {
	 public List<Customer> displayAllCustomers();

}
