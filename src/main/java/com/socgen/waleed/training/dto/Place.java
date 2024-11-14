package com.socgen.waleed.training.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Place {

	@Id
	private Integer id;
	
	private String name;
	
	private String state;
	
	@ManyToOne //Mapping the place to a customer: foriegn key to primary key relationship
	private Customer customer;
	
	public Place() {
		
	}

	public Place(Integer id, String name, String state, Integer customerId) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.customer = new Customer(customerId, "", null);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Place [id=" + id + ", name=" + name + ", State=" + state + ", customer=" + customer + "]";
	}
	
	
	
	
	
	
}
