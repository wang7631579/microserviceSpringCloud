package com.dha.microservice.service;

import java.util.List;

import com.dha.microservice.entity.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
