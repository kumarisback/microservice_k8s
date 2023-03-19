package com.arun.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

	@Autowired
	Openfeignexample o;
	
	@GetMapping("/home")
	private String fun() {
			return "Hi i'm from demo 1 Home";
	}
	
	@GetMapping("/")
	private String fun2() {
		String val=o.getval();
			return "Hi i'm from demo 1"+"--->"+val;
	}
	
	
}
