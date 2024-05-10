package com.hibernate.hibernate_demo.onetoone.services;

import com.hibernate.hibernate_demo.onetoone.entity.MarksCard;
import com.hibernate.hibernate_demo.onetoone.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class MainRunnner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory("student");
		 manager = factory.createEntityManager();
	  transaction =manager.getTransaction();
	  
	  
	  MarksCard card = new MarksCard();
	  card.setGrade("A");
	  card.setMarks(90);
	  
	  
	  Student st = new Student();
	  st.setName("Disha");
	  st.setAge(25);
	
	  st.setMarksCard(card);
	  
	  transaction.begin();
	  manager.persist(st);
	  transaction.commit();
	  
	  manager.close();
	  
	}
}
