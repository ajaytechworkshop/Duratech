/**
 * 
 */
package com.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: Auto-generated Javadoc
/**
 * The Class Trip.
 *
 * @author 5013505250
 */
@Document(collection="Trip")
public class Trip
{

	/** The id. */
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
	private List<Bidding> biddings;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the customer id.
	 *
	 * @return the customer id
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * Sets the customer id.
	 *
	 * @param customerId the new customer id
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Sets the source.
	 *
	 * @param source the new source
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Sets the destination.
	 *
	 * @param destination the new destination
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * Gets the distance.
	 *
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * Sets the distance.
	 *
	 * @param distance the new distance
	 */
	public void setDistance(String distance) {
		this.distance = distance;
	}

	/**
	 * Gets the biddings.
	 *
	 * @return the biddings
	 */
	public List<Bidding> getBiddings() {
		return biddings;
	}

	/**
	 * Sets the biddings.
	 *
	 * @param biddings the new biddings
	 */
	public void setBiddings(List<Bidding> biddings) {
		this.biddings = biddings;
	}



	@Override
	public String toString() {
		return "Trip [id=" + id + ", customerId=" + customerId + ", source="
				+ source + ", destination=" + destination + ", distance="
				+ distance + ", biddings=" + biddings + "]";
	}

	public String toJson()
	{
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
