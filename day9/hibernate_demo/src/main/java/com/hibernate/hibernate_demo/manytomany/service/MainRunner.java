package com.hibernate.hibernate_demo.manytomany.service;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.hibernate_demo.manytomay.entity.Book;

import com.hibernate.hibernate_demo.manytomay.entity.Student2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory	factory = Persistence.createEntityManagerFactory("student");
		EntityManager  manager = factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		
		List<Book> books = new ArrayList<Book>();
		List<Student2> students= new ArrayList<Student2>();
		
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.setTittle("Rich Dad Poor");
		b1.setStudents(students);
		
		b2.setTittle("Cosmos");
		b2.setStudents(students);
		
		b3.setTittle("Othello");
		b3.setStudents(students);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Student2 student1 = new Student2();
		Student2 student2 = new Student2();
		Student2 student3 = new Student2();
		
		student1.setName("Robin");
		student1.setAge(25);
		student1.setBooks(books);
		
		
		student2.setName("Oliver");
		student2.setAge(25);
		student2.setBooks(books);
		
		student3.setName("John");
		student3.setBooks(books);
		student3.setAge(25);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		transaction.begin();
		manager.persist(student3);
		transaction.commit();
		
		manager.close();
		
	}
}
