package com.dha.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableEurekaClient
@EnableCircuitBreaker // 对hystrixR熔断机制的支持
@SpringBootApplication
public class DeptProvider8004_App {

	/*
	 * @Bean public ServletRegistrationBean getServlet() {
	 * HystrixMetricsStreamServlet streamServlet = new
	 * HystrixMetricsStreamServlet(); ServletRegistrationBean registrationBean = new
	 * ServletRegistrationBean(streamServlet); registrationBean.setLoadOnStartup(1);
	 * //系统启动时加载顺序 registrationBean.addUrlMappings("/hystrix.stream");//路径
	 * registrationBean.setName("HystrixMetricsStreamServlet"); return
	 * registrationBean; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8004_App.class, args);
	}
}
