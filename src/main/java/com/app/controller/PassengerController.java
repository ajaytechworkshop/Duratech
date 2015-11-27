/**
 * 
 */
package com.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.constants.URLConstants;
import com.app.model.Passenger;
import com.app.service.PassengerService;

// TODO: Auto-generated Javadoc
/**
 * The Class PassengerController.
 */
@RestController
public class PassengerController 
{

	/** The passenger repo. */
	private PassengerService passengerService;

	/**
	 * @return the passengerService
	 */
	public PassengerService getPassengerService()
	{
		return passengerService;
	}

	/**
	 * @param passengerService the passengerService to set
	 */
	public void setPassengerService(PassengerService passengerService)
	{
		this.passengerService = passengerService;
	}

	/**
	 * Createperson.
	 *
	 * @param passenger the person
	 * @return the string
	 */
	@RequestMapping(value=URLConstants.URL_CREATE_PASSENGER,method=RequestMethod.POST)
	public String createperson(@RequestBody Passenger passenger)
	{
		try
		{
			passengerService.getPassengerRepo().save(passenger);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Passenger Created Successfully";
	}

	@RequestMapping(value=URLConstants.URL_GET_ALL_PASSENGER,method=RequestMethod.GET)
	public @ResponseBody Passenger getPerson()
	{
		Passenger retPerson = null;
		try
		{
			passengerService.getPassengerRepo().findAll();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return retPerson;
	}

	@RequestMapping(value=URLConstants.URL_GET_PASSENGER,method=RequestMethod.GET)
	public @ResponseBody List<Passenger> getPersonByName(@PathVariable("name") String firstName)
	{
		List<Passenger> personLst = null;
		try
		{
			personLst = passengerService.getPassengerRepo().findByFirstName(firstName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return personLst;
	}


	@RequestMapping(value=URLConstants.URL_UPDATE_PASSENGER,method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public void updatePerson(@RequestBody Passenger passenger)
	{
		try
		{
			System.out.println("Updating Passenger:"+passenger.getFirstName()+ " "+ passenger.getLastName());
			passengerService.getPassengerRepo().save(passenger);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@RequestMapping(value=URLConstants.URL_DELETE_PASSENGER,method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public void deletePerson(@PathVariable("id") String id)
	{
		try
		{
			System.out.println("Deleting Passenger:"+id);
			Passenger delPerson = passengerService.getPassengerRepo().findOne(id);
			passengerService.getPassengerRepo().delete(delPerson);
			System.out.println("Passenger Deleted");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
