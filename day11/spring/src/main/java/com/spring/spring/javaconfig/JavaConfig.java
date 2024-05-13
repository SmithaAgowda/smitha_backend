package com.spring.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.spring.javaconfig")
public class JavaConfig {

//	@Bean(name= {"student","std","demoStudent"})
//	public Student getStudent() {
//		
//		return new Student();
//	}
//	@Bean
//	public Samosa getSamosa() {
//		return new Samosa();
//	}
	
	
}
