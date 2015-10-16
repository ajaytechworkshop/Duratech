/**
 * 
 */
package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repositories.PersonRepository;

/**
 * The Class PersonService.
 */
public class PersonService
{
	@Autowired
	private PersonRepository personRepo;

	/**
	 * @return the personRepo
	 */
	public PersonRepository getPersonRepo()
	{
		return personRepo;
	}

	/**
	 * @param personRepo the personRepo to set
	 */
	public void setPersonRepo(PersonRepository personRepo)
	{
		this.personRepo = personRepo;
	}


}
