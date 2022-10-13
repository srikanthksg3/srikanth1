package com.example.demo.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.helper.UserHelper;

@RestController
public class SampleController {
	
	@Autowired
	UserHelper uh;
	
	@GetMapping("/hello")
	public UserHelper hello() {
		return uh;
	}
	
	

}
