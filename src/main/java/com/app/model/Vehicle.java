/**
 * 
 */
package com.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

// TODO: Auto-generated Javadoc
/**
 * The Class Vehicle.
 *
 * @author 5013505250
 */
@Document(collection="Vehicle")
public class Vehicle
{

	/** The id. */
	private String id;

	/** The model. */
	private String model;

	/** The seat capacity. */
	private int seatCapacity;

	/** The ac. */
	private boolean ac;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public String getModel()
	{
		return model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the model to set
	 */
	public void setModel(String model)
	{
		this.model = model;
	}

	/**
	 * Gets the seat capacity.
	 *
	 * @return the seatCapacity
	 */
	public int getSeatCapacity()
	{
		return seatCapacity;
	}

	/**
	 * Sets the seat capacity.
	 *
	 * @param seatCapacity the seatCapacity to set
	 */
	public void setSeatCapacity(int seatCapacity)
	{
		this.seatCapacity = seatCapacity;
	}

	/**
	 * Checks if is ac.
	 *
	 * @return the ac
	 */
	public boolean isAc()
	{
		return ac;
	}

	/**
	 * Sets the ac.
	 *
	 * @param ac the ac to set
	 */
	public void setAc(boolean ac)
	{
		this.ac = ac;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", model=" + model + ", seatCapacity=" + seatCapacity + ", ac=" + ac + "]";
	}


}
