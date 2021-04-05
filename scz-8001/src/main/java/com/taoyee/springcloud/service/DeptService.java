package com.taoyee.springcloud.service;

import java.util.List;

import com.taoyee.springcloud.entities.Dept;

public interface DeptService {
	
	public boolean add(Dept dept) ;
	public Dept findByid(long  id);
	public List<Dept> findAll();

}
