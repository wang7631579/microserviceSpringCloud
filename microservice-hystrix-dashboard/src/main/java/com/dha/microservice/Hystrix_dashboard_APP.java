package com.dha.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class Hystrix_dashboard_APP {
	public static void main(String[] args) {
		SpringApplication.run(Hystrix_dashboard_APP.class, args);
	}
}
