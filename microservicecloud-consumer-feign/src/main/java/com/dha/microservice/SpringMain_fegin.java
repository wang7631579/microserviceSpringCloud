package com.dha.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages="com.dha.microservice.service")
//@ComponentScan("com.dha.microservice.service")
public class SpringMain_fegin {
	public static void main(String[] args) {
		// 1. 追加Feign 的依赖
		// 2. 追加远程调用的接口  并 追加 注解@FeignClient(value = "服务名")
		// 3. 主启动类开启 Feign 功能
		SpringApplication.run(SpringMain_fegin.class, args);

	}

}
