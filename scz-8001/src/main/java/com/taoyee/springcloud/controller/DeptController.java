package com.taoyee.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taoyee.springcloud.entities.Dept;
import com.taoyee.springcloud.service.DeptService;

@RestController()
public class DeptController {
	@Autowired
	private DeptService deptService;
	/**
	 * 
	 * @param dept
	 * @return
	 */
	
	@RequestMapping(value="/dept/add")
	  public boolean add(Dept dept)
	  {
	   return deptService.add(dept);
	  }

	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept findByid(@PathVariable("id") long  id) {
		return this.deptService.findByid(id);
	}
	/**
	 * 
	 * @return 
	 */
	@RequestMapping(value="/dept/list" ,method=RequestMethod.GET)
	public List<Dept> findAll(){
		return this.deptService.findAll();
	}

}
