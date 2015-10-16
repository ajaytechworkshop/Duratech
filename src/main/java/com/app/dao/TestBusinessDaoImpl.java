/**
 * 
 */
package com.app.dao;

import org.springframework.data.mongodb.core.MongoOperations;

import com.app.model.Person;
import com.util.mongodb.MongoDBUtil;

/**
 * @author 5013505250
 *
 */
public class TestBusinessDaoImpl implements ITestBusinessDao 
{

	/* (non-Javadoc)
	 * @see com.app.dao.ITestBusinessDao#createPerson(com.app.model.Person)
	 */
	public void createPerson(Person person) 
	{
		try
		{
			System.out.println("Inside createPerson "+this.getClass().getName());
			MongoOperations mdbTemplate = MongoDBUtil.getMongoTemplate();
			mdbTemplate.save(person,"Person");
			System.out.println("Person Recoed inserted into DB");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
