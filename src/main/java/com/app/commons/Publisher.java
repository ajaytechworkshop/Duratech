package com.app.commons;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Publisher 
{
	public static void publishMessageToExchange(String message,String exchangeName) {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		try {
			Connection connection = factory.newConnection();
			Channel channel = connection.createChannel();
			channel.exchangeDeclare(exchangeName, "fanout");
			//channel.queueDeclare(queue_name, false, false, false, null);
			//String message = "Hello World";
				channel.basicPublish(exchangeName,"", null, message.getBytes());
				System.out.println(" [x] Sent '" + message + "'");
			
			
			//Receive r = new Receive();
			//r.start();
			channel.close();
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
