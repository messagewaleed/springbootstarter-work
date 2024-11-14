package com.socgen.waleed.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.socgen.waleed.training.dto.Customer;
import com.socgen.waleed.training.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repository;
	
	
//	List<Customer> customers =  new ArrayList<>( Arrays.asList(
//			new Customer(726827, "Shanon", 56000L),
//			new Customer(625, "Apeksha", 75000L),
//			new Customer(1019, "Ravi", 536789L),
//			new Customer(6567, "Tarun", 345567L)
//			));
//	
	public Iterable<Customer> getAllCustomers() {
		return repository.findAll();
	}
//	
	public Optional<Customer> getCustomerById(Integer id) {
		return repository.findById(id);
	}
//	
	public void addNewCustomer(Customer customer) {
		repository.save(customer);
	}
	
	public void updateExistingCustomer(Customer customer) {
		repository.save(customer);
	}
	
	public void deleteExistingCustomer(Integer id) {
		repository.deleteById(id);
	}
	public List<Customer> getCustomerByName(String name) {
		return repository.findByName(name);
	}
	
	
	
}

//Spring Data JPA
//	- ORM - Object Relational Mapping
//	- Class <-----> Table
//	- Maps entity classes into sql tables
//	- We don't even have to query
//	- 





