package com.dha.microservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //开启更新功能
public class HelloController {

	@Value("${server.port}")
	int port;

	@Value("${my.name}")
	String name;

	@RequestMapping(path = "/hello")
	public String hello() {
		return name + ":" + port;
	}

}
