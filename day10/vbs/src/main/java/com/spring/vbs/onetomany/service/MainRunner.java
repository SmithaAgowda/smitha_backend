package com.spring.vbs.onetomany.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

public static void main(String[] args) {
		
		
		EntityManagerFactory	factory = Persistence.createEntityManagerFactory("user");
		EntityManager  manager = factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		
		transaction.begin();
	
		transaction.commit();
	}
	
}
