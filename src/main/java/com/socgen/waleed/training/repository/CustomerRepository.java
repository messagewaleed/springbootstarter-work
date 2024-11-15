package com.socgen.waleed.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.waleed.training.dto.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	 List<Customer> findByName(String name);
	 
//	 @Query(nativeQuery = true, value = "sql query here...")
//	 String getData();
	
	
}
