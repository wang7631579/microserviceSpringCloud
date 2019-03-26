package com.dha.microservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dha.microservice.entity.Dept;
import com.dha.microservice.service.DeptService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroProviderTests {

	@Autowired 
	DeptService deptService;
	
	
	@Test
	public void contextLoads() {
		Dept dd = new Dept();
		dd.setDname("WPZ");
		deptService.add(dd);
		
	}

	


}
