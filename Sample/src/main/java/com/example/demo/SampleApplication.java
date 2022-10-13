package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.controller.helper.UserHelper;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		
	}

	@Bean
	@PostConstruct
	public UserHelper addValues() {
		UserHelper uh=new UserHelper("ram", "raj");
		return uh;
	}
}
