package com.sample.samplespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/helloworld")
public class HelloWorld {

	@GetMapping
	public String getMessage() {
		return "Welcome to Simple Spring Boot Project";
	}
}
