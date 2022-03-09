package com.example.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springdemo")
public class AppConfig {

//	@Bean
//	Student getStudent() {
//		return new Student();
//	}
//		
//	@Bean
//	Address getAddress() {
//		return new Address();
//	}
}
