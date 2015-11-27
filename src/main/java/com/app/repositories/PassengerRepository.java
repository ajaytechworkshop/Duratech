/**
 * 
 */
package com.app.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Passenger;

/**
 * The Interface PassengerRepository.
 */
@Repository
public interface PassengerRepository extends MongoRepository<Passenger, String>
{

	/**
	 * Find by first name.
	 *
	 * @param firstName the first name
	 * @return the list
	 */
	public List<Passenger> findByFirstName(String firstName);

	/**
	 * Find by last name.
	 *
	 * @param firstName the first name
	 * @return the list
	 */
	public List<Passenger> findByLastName(String firstName);
}
