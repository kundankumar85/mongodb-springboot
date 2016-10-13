package com.mongo.test.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.test.entity.User;
import com.mongo.test.respository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> findUserDateBetween(Date startDate,Date endDate){
		return userRepo.findByEntryDateBetween(startDate, endDate);
	}

}
