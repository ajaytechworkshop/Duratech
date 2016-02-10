package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.commons.Publisher;
import com.app.constants.URLConstants;
import com.app.model.Bidding;
import com.app.model.Trip;
import com.app.service.TripService;

// TODO: Auto-generated Javadoc
/**
 * The Class TripController.
 */
@RestController
public class TripController 
{

	/** The vehicle service. */
	private TripService tripService;

	/**
	 * Gets the trip service.
	 *
	 * @return the trip service
	 */
	public TripService getTripService() 
	{
		return tripService;
	}

	/**
	 * Sets the trip service.
	 *
	 * @param tripService the new trip service
	 */
	public void setTripService(TripService tripService)
	{
		this.tripService = tripService;
	}

	@RequestMapping(value=URLConstants.URL_CREATE_TRIP,method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.OK)
	public void saveTrip(@RequestBody Trip trip)
	{
		System.out.println("Creating Trip"+ trip.toJson());
		try
		{
			tripService.getTripRepo().save(trip);
			Publisher.publishMessageToExchange(trip.toJson(),"TRIP_EXCHANGE");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@RequestMapping(value=URLConstants.URL_UPDATE_BID+"/{tripId}",method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public void updateBidForTrip(@RequestBody Bidding bidding,@PathVariable("tripId") String tripId)
	{		
		tripService.updateBid(tripId, bidding);
	}
}
