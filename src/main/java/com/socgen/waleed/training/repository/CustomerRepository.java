package com.socgen.waleed.training.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.waleed.training.dto.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
