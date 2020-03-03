package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Villain;

/*
 * Spring annotations
 * - allow us to configure the dependency injection by moving
 * bean configuration to the class itself
 * 
 * We have a Spring Bean called "villainDao"
 */

@Repository("villainDao")
public class VillainDaoImpl implements VillainDao {

	@Override
	public List<Villain> selectAll() {
		//this method is a mock DAO Impl
		List<Villain> vList = new ArrayList<>();
		
		vList.add(new Villain("Michael","None","Mason","IQ"));
		vList.add(new Villain("Josh","Sarcasm","Ji","Don't worry about it"));
		vList.add(new Villain("Mitch","Mitchcraft","Nick","Starbucks"));
		vList.add(new Villain("Charles","Procrastination","Amik","Dunkin Donuts"));
		
		return vList;
	}

}
