package com.dha.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.dha.ribbonrule.MySelfRule;



@EnableDiscoveryClient
@SpringBootApplication
//@RibbonClient(name="aa",configuration=org.springframework.cloud.client.loadbalancer.LoadBalanced.class)
@RibbonClient(name="bb",configuration=MySelfRule.class)
public class SpringMain {
	public static void main(String[] args) {
		// aa 这个服务 使用 平衡算法
		// bb 这个服务 使用 自定义算法
		SpringApplication.run(SpringMain.class, args);

	}

}
