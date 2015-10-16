/**
 * 
 */
package com.app.business;

import com.app.dao.ITestBusinessDao;
import com.app.model.Person;

/**
 * @author 5013505250
 *
 */
public class TestBusiness implements ITestBusiness
{
	private ITestBusinessDao testBusinessDao;

	/**
	 * Gets the test business dao.
	 *
	 * @return the testBusinessDao
	 */
	public ITestBusinessDao getTestBusinessDao() {
		return testBusinessDao;
	}

	/**
	 * @param testBusinessDao the testBusinessDao to set
	 */
	public void setTestBusinessDao(ITestBusinessDao testBusinessDao) 
	{
		this.testBusinessDao = testBusinessDao;
	}

	public void createPerson(Person person)
	{
		try
		{
			System.out.println("Inside createPerson "+this.getClass().getName());
			testBusinessDao.createPerson(person);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
