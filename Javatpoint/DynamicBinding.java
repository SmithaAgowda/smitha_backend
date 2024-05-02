package com.demo;

public class DynamicBinding 
{

	void eat() 
	{
		System.out.println("animal is eating...");
	}
}

class Cat extends DynamicBinding
{
	void eat() 
	{
		System.out.println("Cat is eating...");
	}

	public static void main(String args[]) 
	{

		DynamicBinding a = new Cat();
		a.eat();
	}
}
