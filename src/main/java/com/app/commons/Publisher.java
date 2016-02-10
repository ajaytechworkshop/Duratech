package com.app.commons;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Publisher 
{
	public static void publishMessageToExchange(String message,String exchangeName) {

		try 
		{
			ConnectionFactory factory = new ConnectionFactory();
			factory.setHost("localhost");

			System.out.println("Publishing messgae to "+exchangeName);

			Connection connection = factory.newConnection();
			Channel channel = connection.createChannel();
			channel.exchangeDeclare(exchangeName, "fanout");
			channel.basicPublish(exchangeName,"", null, message.getBytes());

			System.out.println(" [x] Sent '" + message + "'");

			channel.close();
			connection.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
