/**
 * 
 */
package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.constants.URLConstants;
import com.app.model.Driver;
import com.app.service.DriverCrudService;

/**
 * @author 5013505250
 *
 */
@RestController
public class DriverController
{

	/** The driver service. */
	private DriverCrudService driverCrudService;


	/**
	 * @return the driverCrudService
	 */
	public DriverCrudService getDriverCrudService()
	{
		return driverCrudService;
	}


	/**
	 * @param driverCrudService the driverCrudService to set
	 */
	public void setDriverCrudService(DriverCrudService driverCrudService)
	{
		this.driverCrudService = driverCrudService;
	}


	@RequestMapping(value=URLConstants.URL_SAVE_DRIVER,method=RequestMethod.POST)
	public String saveDrvier(@RequestBody Driver driver)
	{
		try
		{
			driverCrudService.getDriverRepo().save(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Driver created success";
	}

	@RequestMapping(value=URLConstants.URL_GET_ALL_DRIVER,method=RequestMethod.GET)
	public @ResponseBody List<Driver> getAllDrivers()
	{
		List<Driver> drivers = null;
		try
		{
			drivers = driverCrudService.getDriverRepo().findAll();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return drivers;
	}


}
