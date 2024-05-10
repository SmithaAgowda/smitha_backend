package com.hibernate.hibernate_demo.onetomany.service;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.hibernate_demo.onetomany.entity.Laptop;

import com.hibernate.hibernate_demo.onetomany.entity.Student1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory	factory = Persistence.createEntityManagerFactory("student");
		EntityManager  manager = factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		
	    List<Laptop> laptops = new ArrayList<>();

		Laptop laptop1 =new Laptop();
		Laptop laptop2 =new Laptop();
		Laptop laptop3 =new Laptop();
		
		Student1 student = new Student1();
		
		laptop1.setBrand("dell");
		laptop1.setSerialNo("AFDFMGJ");
		laptop1.setStudent(student);
		
		laptop2.setBrand("leneno");
		laptop2.setSerialNo("AFDFMGJ");
		laptop2.setStudent(student);
		
		laptop3.setBrand("Acer");
		laptop3.setSerialNo("AFDFMGJ");
		laptop3.setStudent(student);
		
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		
		student.setName("robin");
		student.setAge(25);
		student.setLaptops(laptops);
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		System.out.println(manager.find(Student1.class,1));
	}
	
	
	
	
	
	
}
