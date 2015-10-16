/**
 * 
 */
package com.app.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Person;

/**
 * The Interface PersonRepository.
 */
@Repository
public interface PersonRepository extends MongoRepository<Person, String>
{

	/**
	 * Find by first name.
	 *
	 * @param firstName the first name
	 * @return the list
	 */
	public List<Person> findByFirstName(String firstName);

	/**
	 * Find by last name.
	 *
	 * @param firstName the first name
	 * @return the list
	 */
	public List<Person> findByLastName(String firstName);
}
