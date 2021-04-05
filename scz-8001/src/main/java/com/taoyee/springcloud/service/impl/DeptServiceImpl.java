package com.taoyee.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taoyee.springcloud.dao.DeptDao;
import com.taoyee.springcloud.entities.Dept;
import com.taoyee.springcloud.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
    private DeptDao deptDao;
	@Override
	public boolean add(Dept dept) {
		return this.deptDao.addDept(dept);
	}

	@Override
	public Dept findByid(long id) {
		return this.deptDao.findByid(id);
	}

	@Override
	public List<Dept> findAll() {
		return this.deptDao.findAll();
	}

}
