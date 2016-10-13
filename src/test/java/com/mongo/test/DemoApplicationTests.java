package com.mongo.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongo.test.config.AppConfig;
import com.mongo.test.entity.Address;
import com.mongo.test.entity.Department;
import com.mongo.test.entity.User;
import com.mongo.test.respository.UserRepository;
import com.mongo.test.service.UserService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { AppConfig.class})
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private MongoTemplate mongoTemp;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void findUser() {
		Order orders = new Order(Sort.Direction.ASC, "empid");
		Sort sort = new Sort(orders);
		List<User> users = userRepo.findAll(sort);
		System.out.println(users);
	}
	
	@Test
	public void findUsers() {
		
		List<User> users = userService.findUserDateBetween(new Date(2015,10,03), new Date(2016,10,11));
		System.out.println(users);
	}
	
	
	@Test
	public void saveUser(){
		User user = new User();
		
		Address add1 = new Address();
		add1.setHouseName("Gulmohar");
		add1.setAddrLine1("near bus depo");
		add1.setAddrLine2("Line2");
		
		Address add2 = new Address();
		add2.setHouseName("Gulmohar villa");
		add2.setAddrLine1("line1");
		add2.setAddrLine2("Line2");
		
		List< Address> addresses = new ArrayList<>();
		addresses.add(add1);
		addresses.add(add2);
		user.setEmpid(204);
		user.setName("kundan");
		user.setUserAddr(addresses);
		
		Department department = new Department(2, "Chemestry");
		user.setDepartment(department);
		user.setEntryDate(Date.from(LocalDate.of(2016, 10, 8).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
		User user2 = userRepo.save(user);
		System.out.println(user2);
		
		
	}
	
	

}
