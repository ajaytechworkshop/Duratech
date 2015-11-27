/**
 * 
 */
package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repositories.VehicleRepository;

/**
 * The Class VehicleService.
 *
 * @author 5013505250
 */
public class VehicleService
{

	/** The vehicle repository. */
	@Autowired
	private VehicleRepository vehicleRepo;

	/**
	 * Gets the vehicle repository.
	 *
	 * @return the vehicleRepository
	 */
	public VehicleRepository getVehicleRepo()
	{
		return vehicleRepo;
	}

	/**
	 * Sets the vehicle repository.
	 *
	 * @param vehicleRepository the vehicleRepository to set
	 */
	public void setVehicleRepo(VehicleRepository vehicleRepository)
	{
		this.vehicleRepo = vehicleRepository;
	}
}
