package com.dha.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableCircuitBreaker//对hystrixR熔断机制的支持
@SpringBootApplication
public class DeptProvider8003_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8003_App.class, args);
	}
}
