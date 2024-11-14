package com.socgen.waleed.training.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.waleed.training.dto.Place;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Integer> {

	List<Place> findByCustomerId(Integer customerId);
}
