package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repositories.TripRepository;

/**
 * The Class TripService.
 */
public class TripService 
{
	
	/** The trip repo. */
	@Autowired
	private TripRepository tripRepo;

	/**
	 * Gets the trip repo.
	 *
	 * @return the trip repo
	 */
	public TripRepository getTripRepo() {
		return tripRepo;
	}

	/**
	 * Sets the trip repo.
	 *
	 * @param tripRepo the new trip repo
	 */
	public void setTripRepo(TripRepository tripRepo) {
		this.tripRepo = tripRepo;
	}

}
