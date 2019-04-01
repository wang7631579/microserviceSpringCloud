package com.dha.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dha.microservice.entity.Dept;
import com.dha.microservice.service.DeptService;

@RestController
public class DeptController_Consumer {

	@Autowired
	DeptService deptService;

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return deptService.list();
	}

	
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id) {
		return deptService.get(id);
	}


}
