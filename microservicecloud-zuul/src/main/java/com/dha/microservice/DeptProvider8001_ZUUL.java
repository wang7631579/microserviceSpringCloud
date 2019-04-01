package com.dha.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableDiscoveryClient
//支持网关路由
@EnableZuulProxy
@SpringBootApplication
public class DeptProvider8001_ZUUL
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8001_ZUUL.class, args);
	}
}
