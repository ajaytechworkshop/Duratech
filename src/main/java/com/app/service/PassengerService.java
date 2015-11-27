/**
 * 
 */
package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repositories.PassengerRepository;

/**
 * The Class PassengerService.
 */
public class PassengerService
{
	@Autowired
	private PassengerRepository passengerRepo;

	/**
	 * @return the passengerRepo
	 */
	public PassengerRepository getPassengerRepo()
	{
		return passengerRepo;
	}

	/**
	 * @param passengerRepo the passengerRepo to set
	 */
	public void setPassengerRepo(PassengerRepository passengerRepo)
	{
		this.passengerRepo = passengerRepo;
	}

}
