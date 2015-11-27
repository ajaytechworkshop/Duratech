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
import com.app.model.Vehicle;
import com.app.service.VehicleService;

/**
 * @author 5013505250
 *
 */
@RestController
public class VehicleController
{

	/** The vehicle service. */
	private VehicleService vehicleService;

	/**
	 * @return the vehicleService
	 */
	public VehicleService getVehicleService()
	{
		return vehicleService;
	}

	/**
	 * @param vehicleService the vehicleService to set
	 */
	public void setVehicleService(VehicleService vehicleService)
	{
		this.vehicleService = vehicleService;
	}

	@RequestMapping(value=URLConstants.URL_SAVE_VEHICLE,method=RequestMethod.POST)
	public String createVehicle(@RequestBody Vehicle vehicle)
	{
		try
		{
			vehicleService.getVehicleRepo().save(vehicle);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Vehicle crated successfully";
	}

	@RequestMapping(value=URLConstants.URL_GET_ALL_VEHICLES,method=RequestMethod.GET)
	public @ResponseBody List<Vehicle> getAllVehicles()
	{
		List<Vehicle> vehicles = null;
		try
		{
			vehicles = vehicleService.getVehicleRepo().findAll();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return vehicles;
	}
}
