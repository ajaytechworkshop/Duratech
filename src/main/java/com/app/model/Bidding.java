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
@Document(collection="Bidding")
public class Bidding implements Comparable<Bidding>
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "Bidding [id=" + id + ", driverId=" + driverId + ", bidAmount=" + bidAmount + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() 
	{
		return (id == null) ? 0 : id.hashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{	
			return false;
		}
		Bidding other = (Bidding) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} 
		else if (!id.equals(other.id))
		{
			return false;
		}
		return true;
	}

	public int compareTo(Bidding obj) 
	{
		if(this.getBidAmount() == obj.getBidAmount())
		{
			return 0;
		}
		else if (this.getBidAmount() > obj.getBidAmount())
		{
			return 1;
		}
		else
			return -1;
	}

}
