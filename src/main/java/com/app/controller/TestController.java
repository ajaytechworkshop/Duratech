/**
 * 
 */
package com.app.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.business.ITestBusiness;
import com.app.model.Person;

// TODO: Auto-generated Javadoc
/**
 * The Class TestController.
 */
@RestController
public class TestController 
{

	/** The test business. */
	private ITestBusiness testBusiness;

	/**
	 * @return the testBusiness
	 */
	public ITestBusiness getTestBusiness() {
		return testBusiness;
	}

	/**
	 * @param testBusiness the testBusiness to set
	 */
	public void setTestBusiness(ITestBusiness testBusiness) {
		this.testBusiness = testBusiness;
	}

	/**
	 * Createperson.
	 *
	 * @param person the person
	 * @return the string
	 */
	@RequestMapping(value="app/createperson",method=RequestMethod.POST)
	public String createperson(@RequestBody Person person)
	{
		try
		{
			System.out.println("Isnide createperson TestController:"+person.getFirstName());
			testBusiness.createPerson(person);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Person Created Successfully";
	}
}
