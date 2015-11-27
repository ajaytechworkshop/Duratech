/**
 * 
 */
package com.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Vehicle;

/**
 * @author 5013505250
 *
 */
public interface VehicleRepository extends MongoRepository<Vehicle, String>
{

}
