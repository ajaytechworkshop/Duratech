package com.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Trip;

/**
 * The Interface TripRepository.
 */
public interface TripRepository extends MongoRepository<Trip, String> 
{

}
