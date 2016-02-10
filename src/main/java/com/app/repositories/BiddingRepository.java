/**
 * 
 */
package com.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Bidding;

/**
 * @author 5013505250
 *
 */
public interface BiddingRepository extends MongoRepository<Bidding, String> 
{

}
