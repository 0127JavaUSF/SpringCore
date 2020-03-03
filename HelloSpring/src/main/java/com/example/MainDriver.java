package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.VillainService;

public class MainDriver {

	//before DI
	//private static VillainServiceImpl v = new VillainServiceImple();
	//we don't have to create our own instances when we have DI
	
	@Autowired
	private static VillainService vServ;
	
	public static void main(String[] args) {
		
		//Application Context is the bean configuration file
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		vServ = appContext.getBean("villainService", VillainService.class);
		System.out.println(vServ.getAllVillains());
	}
}
