package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.VillainDao;
import com.example.model.Villain;


/*
 * Stereotype annotation - annotation above a class definition that
 * indicates that it is a bean Spring can manage
 * @Component(parent)
 * @Repository
 * @Controller
 * @Service
 * @Configuration
 */
@Service("villainService")
public class VillainServiceImpl implements VillainService {
	
	//with Dependency Injection
	@Autowired
	private VillainDao villainDao;

	@Override
	public List<Villain> getAllVillains() {
		//old way
		//VillainDaoImpl v = new VillainDaoImpl();
		return villainDao.selectAll();
	}
	
	public VillainServiceImpl() {
		System.out.println("in no args constructor");
	}
	
	@Autowired
	//the autowired annotaion tells Spring to attempt autowiring
	//using the below method, aka our setter
	public void setVillainDao(VillainDao vDao) {
		System.out.println("in setter");
		this.villainDao = vDao;
	}
	
	@Autowired
	public VillainServiceImpl(VillainDao vDao) {
		System.out.println("In DI constructor");
		this.villainDao = vDao;
	}

}
