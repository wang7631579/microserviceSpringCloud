package com.dha.microservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {		
		return new RestTemplate();
	}

	@Bean
	public IRule ribbonRule() {
		// 如果想 自定义 负载均衡规则  则需要  去看git hub 上 ribbon 的源码 去进行修改 
		// https://github.com/Netflix/ribbon/tree/master/ribbon-loadbalancer/src/main/java/com/netflix/loadbalancer
		// 配置IRule 后 相当于 全局 都是用 随机规则
		return new RandomRule();
	}
	
}
