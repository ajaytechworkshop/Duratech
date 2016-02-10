/**
 * 
 */
package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// TODO: Auto-generated Javadoc
/**
 * The Class Driver.
 *
 * @author 5013505250
 */
@Document(collection="Driver")
public class Driver
{

	/** The id. */
	@Id
	private String id;

	/** The driver name. */
	private String driverName;

	/** The age. */
	private int age;

	/** The gender. */
	private String gender;

	/** The contact number1. */
	private int contactNumber1;

	/** The contact number2. */
	private int contactNumber2;

	/** The vehicle id. */
	private int vehicleId;

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
	 * @return the driverName
	 */
	public String getDriverName()
	{
		return driverName;
	}

	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName)
	{
		this.driverName = driverName;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender()
	{
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	/**
	 * @return the contactNumber1
	 */
	public int getContactNumber1()
	{
		return contactNumber1;
	}

	/**
	 * @param contactNumber1 the contactNumber1 to set
	 */
	public void setContactNumber1(int contactNumber1)
	{
		this.contactNumber1 = contactNumber1;
	}

	/**
	 * @return the contactNumber2
	 */
	public int getContactNumber2()
	{
		return contactNumber2;
	}

	/**
	 * @param contactNumber2 the contactNumber2 to set
	 */
	public void setContactNumber2(int contactNumber2)
	{
		this.contactNumber2 = contactNumber2;
	}

	/**
	 * @return the vehicleId
	 */
	public int getVehicleId()
	{
		return vehicleId;
	}

	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(int vehicleId)
	{
		this.vehicleId = vehicleId;
	}

	/**
	 * @return the vehicleOwningCompany
	 */
	public String getVehicleOwningCompany()
	{
		return vehicleOwningCompany;
	}

	/**
	 * @param vehicleOwningCompany the vehicleOwningCompany to set
	 */
	public void setVehicleOwningCompany(String vehicleOwningCompany)
	{
		this.vehicleOwningCompany = vehicleOwningCompany;
	}

	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * @return the region
	 */
	public String getRegion()
	{
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region)
	{
		this.region = region;
	}

	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state)
	{
		this.state = state;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality()
	{
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}

	/** The vehicle owning company. */
	private String vehicleOwningCompany;

	/** The address. */
	private String address;

	/** The region. */
	private String region;

	/** The city. */
	private String city;

	/** The state. */
	private String state;

	/** The nationality. */
	private String nationality;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "Driver [id=" + id + ", driverName=" + driverName + ", age=" + age + ", gender=" + gender
				+ ", contactNumber1=" + contactNumber1 + ", contactNumber2=" + contactNumber2 + ", vehicleId="
				+ vehicleId + ", vehicleOwningCompany=" + vehicleOwningCompany + ", address=" + address + ", region="
				+ region + ", city=" + city + ", state=" + state + ", nationality=" + nationality + "]";
	}


}
