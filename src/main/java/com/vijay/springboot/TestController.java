package com.vijay.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(name = "/test")
	public String testMethod() {
		System.out.println("I am here");
		return "Hello I am from Contoller";

	}

}
