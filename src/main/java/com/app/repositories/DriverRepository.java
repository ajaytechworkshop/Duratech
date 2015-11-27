/**
 * 
 */
package com.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Driver;

/**
 * @author 5013505250
 *
 */
public interface DriverRepository extends MongoRepository<Driver,String>
{

}
