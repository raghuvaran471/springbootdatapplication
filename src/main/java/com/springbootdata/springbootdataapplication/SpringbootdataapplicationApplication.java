package com.springbootdata.springbootdataapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springbootdata.springbootdataapplication.entities.ContactsMasterEntity;
import com.springbootdata.springbootdataapplication.repositories.ContactMasterRepo;

@SpringBootApplication
public class SpringbootdataapplicationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(SpringbootdataapplicationApplication.class, args);
		
		
		
	ContactMasterRepo bean =ctxt.getBean(ContactMasterRepo.class);
	
		System.out.println("====>"+bean.getClass().getName());
		
		ctxt.close();
	}

}
