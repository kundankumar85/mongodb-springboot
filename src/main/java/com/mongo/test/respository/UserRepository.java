package com.mongo.test.respository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.test.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	List<User> findByEntryDateBetween(Date date1,Date date2);
}
