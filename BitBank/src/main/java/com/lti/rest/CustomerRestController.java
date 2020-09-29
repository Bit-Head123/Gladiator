package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Customer;
import com.lti.service.CustomerService;

@CrossOrigin
@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String addCustomer(@RequestBody Customer cust) {
		service.persist(cust);
		return "Customer added successfully";
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<Customer> listCustomers(){
		return service.load();
	}
}
