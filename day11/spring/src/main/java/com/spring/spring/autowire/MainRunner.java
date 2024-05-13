package com.spring.spring.autowire;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spring/autowire/config.xml");
		
		Employee employee =context.getBean("employee",Employee.class);
		
		System.err.println(employee);
	}
}
