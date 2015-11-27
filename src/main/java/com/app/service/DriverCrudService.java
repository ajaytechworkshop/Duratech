/**
 * 
 */
package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repositories.DriverRepository;

/**
 * @author 5013505250
 *
 */
public class DriverCrudService
{

	/** The driver repo. */
	@Autowired
	private DriverRepository driverRepo;

	/**
	 * @return the driverRepo
	 */
	public DriverRepository getDriverRepo()
	{
		return driverRepo;
	}

	/**
	 * @param driverRepo
	 *            the driverRepo to set
	 */
	public void setDriverRepo(DriverRepository driverRepo)
	{
		this.driverRepo = driverRepo;
	}
}
