package com.socgen.waleed.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socgen.waleed.training.dto.Place;
import com.socgen.waleed.training.repository.PlaceRepository;

@Service
public class PlaceService {
	
	@Autowired
	PlaceRepository repo;
	
	public List<Place> getPlacesByCustomerId(Integer customerId) {
		return repo.findByCustomerId(customerId);
	}
	
	public Optional<Place> getPlaceByPlaceId(Integer placeId) {
		return repo.findById(placeId);
	}
	
	public void addNewPlace(Place place) {
		repo.save(place);
	}
	
	public void updatePlace(Place place) {
		repo.save(place);
	}
	
	public void deletePlace(Integer placeId) {
		repo.deleteById(placeId);
	}
	
	

}
