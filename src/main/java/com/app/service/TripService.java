package com.app.service;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.commons.Publisher;
import com.app.model.Bidding;
import com.app.model.Trip;
import com.app.repositories.BiddingRepository;
import com.app.repositories.TripRepository;

/**
 * The Class TripService.
 */
public class TripService 
{

	/** The trip repo. */
	@Autowired
	private TripRepository tripRepo;

	@Autowired
	private BiddingRepository biddingRepo;

	/**
	 * Gets the trip repo.
	 *
	 * @return the trip repo
	 */
	public TripRepository getTripRepo() 
	{
		return tripRepo;
	}

	/**
	 * Sets the trip repo.
	 *
	 * @param tripRepo the new trip repo
	 */
	public void setTripRepo(TripRepository tripRepo) 
	{
		this.tripRepo = tripRepo;
	}



	/**
	 * @return the biddingRepo
	 */
	public BiddingRepository getBiddingRepo() {
		return biddingRepo;
	}

	/**
	 * @param biddingRepo the biddingRepo to set
	 */
	public void setBiddingRepo(BiddingRepository biddingRepo) {
		this.biddingRepo = biddingRepo;
	}

	/**
	 * Update bid.
	 *
	 * @param tripId the trip id
	 * @param trip the trip
	 */
	public void updateBid(String tripId,Bidding bid)
	{
		try
		{
			Trip tripToUpdate = tripRepo.findOne(tripId);
			System.out.println("***Bid to save:"+bid.toString());
			biddingRepo.save(bid);

			if(tripToUpdate != null && tripToUpdate.getBiddings() == null)
			{
				tripToUpdate.setBiddings(new ArrayList<Bidding>());
			}

			if(tripToUpdate!= null && !tripToUpdate.getBiddings().contains(bid))
			{
				tripToUpdate.getBiddings().add(bid);
			}
			if(tripToUpdate !=null && tripToUpdate.getBiddings().contains(bid))
			{
				for(Bidding b : tripToUpdate.getBiddings())
				{
					if(b.getId().equals(bid.getId()))
					{
						b.setBidAmount(bid.getBidAmount());
						b.setDriverId(bid.getDriverId());
						break;
					}
				}
			}

			Collections.sort(tripToUpdate.getBiddings());
			tripRepo.save(tripToUpdate);
			System.out.println("Updated Trip:"+tripToUpdate.toJson());
			
			//Publish the message to RabbitMQ exchnage so that new bid value will be updated to the drivers
			Publisher.publishMessageToExchange(tripToUpdate.toJson(),"BIDDING_EXCHANGE");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
