/**
 * 
 */
package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 5013505250
 *
 */
@Document(collection="Bidder")
public class Bidding
{

	/** The id. */
	@Id
	private String id;

	/** The driver. */
	private String driverId;


	/** The bid amount. */
	private int bidAmount;

	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @return the driverId
	 */
	public String getDriverId()
	{
		return driverId;
	}

	/**
	 * @param driverId the driverId to set
	 */
	public void setDriverId(String driverId)
	{
		this.driverId = driverId;
	}

	/**
	 * @return the bidAmount
	 */
	public int getBidAmount()
	{
		return bidAmount;
	}

	/**
	 * @param bidAmount the bidAmount to set
	 */
	public void setBidAmount(int bidAmount)
	{
		this.bidAmount = bidAmount;
	}
}
