package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.VillainDao;
import com.example.model.Villain;

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

}
