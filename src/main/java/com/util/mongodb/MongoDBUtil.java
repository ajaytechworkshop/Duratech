package com.util.mongodb;

import java.net.UnknownHostException;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

// TODO: Auto-generated Javadoc
/**
 * The Class MongoDBUtil.
 */
public class MongoDBUtil 
{

	/** The mongo client. */
	private static MongoClient mongoClient;

	/** The mongo template. */
	private static MongoOperations mongoTemplate;

	/** The Constant MONGO_HOST. */
	private final static String MONGO_HOST = "localhost";

	/** The Constant MONGO_PORT. */
	private final static int MONGO_PORT = 27107;


	/**
	 * Gets the mongo client.
	 *
	 * @return the mongo client
	 * @throws UnknownHostException the unknown host exception
	 */

	public static MongoClient getMongoClient() 
	{
		try
		{
			if(mongoClient == null)
			{
				return new MongoClient("localhost",27017);
			}
		}
		catch(Exception e)
		{

		}
		return mongoClient;
	}

	/**
	 * Gets the mongo template.
	 *
	 * @return the mongo template
	 */
	public static MongoOperations getMongoTemplate()
	{
		if(MongoDBUtil.mongoTemplate == null)
		{
			mongoTemplate = new MongoTemplate(getMongoClient(),"test");
		}
		return mongoTemplate;
	}



}
