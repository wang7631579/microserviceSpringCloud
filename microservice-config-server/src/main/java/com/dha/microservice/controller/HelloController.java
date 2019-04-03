package com.dha.microservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

	@Value("${server.port}")
	int port;

	@Value("${spring.application.name}")
	String name;

	@RequestMapping(path = "/hello")
	public String hello() {

		return name + ":" + port;
	}

}
