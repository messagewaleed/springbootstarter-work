package com.socgen.waleed.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.waleed.training.dto.Customer;
import com.socgen.waleed.training.dto.Place;
import com.socgen.waleed.training.service.PlaceService;

@RestController
@RequestMapping("places/v1.0")
public class PlaceController {
	
	@Autowired
	PlaceService service;
	
	@GetMapping("/customers/{customerId}")
	List<Place> getPlacesByCustomerId(@PathVariable Integer customerId) {
		return service.getPlacesByCustomerId(customerId);
	}
	
	@GetMapping("/{id}")
	Optional<Place> getPlaceByPlaceId(@PathVariable Integer placeId) {
		return service.getPlaceByPlaceId(placeId);
	}
	
	@PostMapping("/{customerId}")
	void addNewPlace(@PathVariable Integer customerId, @RequestBody Place place) {
		
		place.setCustomer(new Customer(customerId, null, null));
		
		service.addNewPlace(place);
	}
	
	@PutMapping("/{customerId}")
	void updatePlace(@PathVariable Integer customerId ,@RequestBody Place place) {
		
		place.setCustomer(new Customer(customerId, null, null));
		
		service.updatePlace(place);
	}
	
	@DeleteMapping("/{placeId}")
	void deletePlace(@PathVariable Integer placeId) {
		service.deletePlace(placeId);
	}
}
