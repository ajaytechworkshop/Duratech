/**
 * 
 */
package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.constants.URLConstants;
import com.app.model.Person;
import com.app.service.PersonService;

// TODO: Auto-generated Javadoc
/**
 * The Class TestController.
 */
@RestController
public class TestController 
{
//
//	/** The person repo. */
//	@Autowired
//	private PersonService personService;
//
//	/**
//	 * @return the personService
//	 */
//	public PersonService getPersonService()
//	{
//		return personService;
//	}
//
//	/**
//	 * @param personService the personService to set
//	 */
//	public void setPersonService(PersonService personService)
//	{
//		this.personService = personService;
//	}
//
//
//
//	/**
//	 * Createperson.
//	 *
//	 * @param person the person
//	 * @return the string
//	 */
//	@RequestMapping(value=URLConstants.URL_CREATE_PESON,method=RequestMethod.POST)
//	public String createperson(@RequestBody Person person)
//	{
//		try
//		{
//			personService.getPersonRepo().save(person);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return "Person Created Successfully";
//	}
//
//	@RequestMapping(value=URLConstants.URL_GET_ALL_PESON,method=RequestMethod.GET)
//	public @ResponseBody Person getPerson()
//	{
//		Person retPerson = null;
//		try
//		{
//			personService.getPersonRepo().findAll();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return retPerson;
//	}
//
//	@RequestMapping(value=URLConstants.URL_GET_PESON,method=RequestMethod.GET)
//	public @ResponseBody List<Person> getPersonByName(@PathVariable("name") String firstName)
//	{
//		List<Person> personLst = null;
//		try
//		{
//			personLst = personService.getPersonRepo().findByFirstName(firstName);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return personLst;
//	}
//
//
//	@RequestMapping(value=URLConstants.URL_UPDATE_PESON,method=RequestMethod.PUT)
//	@ResponseStatus(value=HttpStatus.OK)
//	public void updatePerson(@RequestBody Person person)
//	{
//		try
//		{
//			System.out.println("Updating Person:"+person.getFirstName()+ " "+ person.getLastName());
//			personService.getPersonRepo().save(person);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//
//	@RequestMapping(value=URLConstants.URL_DELETE_PESON,method=RequestMethod.PUT)
//	@ResponseStatus(value=HttpStatus.OK)
//	public void deletePerson(@PathVariable("id") String id)
//	{
//		try
//		{
//			System.out.println("Deleting Person:"+id);
//			Person delPerson = personService.getPersonRepo().findOne(id);
//			personService.getPersonRepo().delete(delPerson);
//			System.out.println("Person Deleted");
//
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
}
