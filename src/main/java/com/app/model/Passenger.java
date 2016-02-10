package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// TODO: Auto-generated Javadoc
/**
 * The Class Passenger.
 */
@Document(collection="Passenger")
public class Passenger 
{

	/** The id. */
	@Id
	private String id;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The phone number. */
	private String phoneNumber;

	/** The email. */
	private String email;

	/** The mobile no. */
	private String mobileNo;

	/**
	 * Gets the phone number.
	 *
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * Gets the mobile no.
	 *
	 * @return the mobileNo
	 */
	public String getMobileNo()
	{
		return mobileNo;
	}

	/**
	 * Sets the mobile no.
	 *
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo)
	{
		this.mobileNo = mobileNo;
	}

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
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}



}
