package com.taoyee.springcloud.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.taoyee.springcloud.entities.Dept;

@RestController
public class XFZController {
	@Autowired
	private RestTemplate restTemplate;
	private static final String URI="http://localhost:8001";
	/**
	 * 
	 * @param dept
	 * @return
	 */
	@RequestMapping(value="/xfz/dept/add" ,method = RequestMethod.POST)
	public boolean addDept( Dept dept) {
		return this.restTemplate.postForObject(URI+"/dept/add", dept,Boolean.class);
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/xfz/dept/get/{id}")
	public Dept findByid(@PathVariable("id") long  id) {
		return this.restTemplate.getForObject(URI+"/dept/get/"+id, Dept.class);
	}
	/**
	 * 
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/xfz/dept/list" )
	public List<Dept> list(){
		return this.restTemplate.getForObject(URI+"/dept/list", List.class);
	}

}
