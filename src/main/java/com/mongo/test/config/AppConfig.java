package com.mongo.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages="com.mongo.test")
@ComponentScan(basePackages="com.mongo.test")
public class AppConfig {

}
