package com.socgen.waleed.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	List<Customer> customers =  new ArrayList<>( Arrays.asList(
			new Customer(726827, "Shanon", 56000L),
			new Customer(625, "Apeksha", 75000L),
			new Customer(1019, "Ravi", 536789L),
			new Customer(6567, "Tarun", 345567L)
			));
	
	@GetMapping("/customers")
	List<Customer> getAllCustomers() {
		return customers;
	}
	
	@GetMapping("/customers/{accountNumber}")
	Customer getCustomerById(@PathVariable Integer accountNumber) {
		return customers.stream().filter(ref -> ref.accountNumber().equals(accountNumber)).findFirst().get();
	}
	
	@PostMapping("/customers")
	void addNewCustomer(@RequestBody Customer customer) {
		customers.add(customer);
	}
	
	
	
	
	
}
