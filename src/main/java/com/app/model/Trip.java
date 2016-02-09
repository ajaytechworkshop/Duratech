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
@Document(collection="Trip")
public class Trip
{
	@Id
	private String id;

	/** The customer id. */
	private String customerId;

	/** The source. */
	private String source;

	/** The destination. */
	private String destination;

	/** The distance. */
	private String distance;

	/** The bidding. */
	private Bidding[] biddings;

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
	 * @return the customerId
	 */
	public String getCustomerId()
	{
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	/**
	 * @return the source
	 */
	public String getSource()
	{
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source)
	{
		this.source = source;
	}

	/**
	 * @return the destination
	 */
	public String getDestination()
	{
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	/**
	 * @return the distance
	 */
	public String getDistance()
	{
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(String distance)
	{
		this.distance = distance;
	}

	/**
	 * @return the bidding
	 */
	public Bidding[] getBidding()
	{
		return bidding;
	}

	/**
	 * @param bidding the bidding to set
	 */
	public void setBidding(Bidding[] bidding)
	{
		this.bidding = bidding;
	}
}
