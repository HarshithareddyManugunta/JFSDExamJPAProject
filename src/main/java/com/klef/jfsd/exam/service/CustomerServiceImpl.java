package com.klef.jfsd.exam.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;
	@Service
	public class CustomerServiceImpl implements CustomerService
	{
		@Autowired
	    private CustomerRepository customerRepository;
		public List<Customer> displayAllCustomers() {
			// TODO Auto-generated method stub
			return customerRepository.findAll();
		}
	

}
