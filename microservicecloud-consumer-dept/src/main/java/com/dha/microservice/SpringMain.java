package com.dha.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@EnableDiscoveryClient
@SpringBootApplication
public class SpringMain {	
	public static void main(String[] args) {
		SpringApplication.run(SpringMain.class, args);

	}

}
