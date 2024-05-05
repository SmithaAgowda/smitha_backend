package com.demo;

public class StaticBinding 
{
 
		 private void eat()
		 {
			 System.out.println("dog is eating...");
			 }  
		  
		 public static void main(String args[])
		 {  
		  Dog d1=new Dog();  
		  d1.eat();  
		 }  
		}  

