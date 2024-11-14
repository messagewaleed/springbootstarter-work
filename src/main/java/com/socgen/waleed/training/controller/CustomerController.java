package com.socgen.waleed.training.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.waleed.training.dto.Customer;
import com.socgen.waleed.training.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/customers")
	Iterable<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}
	
	@GetMapping("/customers/{id}")
	Optional<Customer> getCustomerById(@PathVariable Integer id) {
		return service.getCustomerById(id);
	}
	
	@GetMapping("/customers/name/{name}")
	List<Customer> getCustomerByName(@PathVariable String name) {
		return service.getCustomerByName(name);
	}
//	
	@PostMapping("/customers")
	void addNewCustomer(@RequestBody Customer customer) {
		service.addNewCustomer(customer);
	}
	
	@PutMapping("/customers/{id}")
	void updateExistingCustomer(@RequestBody Customer customer) {
		service.updateExistingCustomer(customer);
	}
	
	@DeleteMapping("/customers/{id}")
	public void deleteExistingCustomer(@PathVariable Integer id) {
		service.deleteExistingCustomer(id);
	}
	
	
	
	
	
}
