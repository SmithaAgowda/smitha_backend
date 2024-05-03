package com.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentHash {
	
	int id;
	String name;
	int marks;
	int age;
	
	public StudentHash(int id, String name, int marks, int age) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	
	@Override
	public String toString() 
	{
		
		return this.id + " " + this.name + " " + this.marks + " " + this.age;
	}
	
	@Override
	public int hashCode() {
		
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		StudentHash std =(StudentHash)obj;
		return this.hashCode() ==std.hashCode() && this.marks == std.marks && this.name == std.name;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Set<StudentHash> hs = new HashSet<>();
		while(true)
		{
           System.out.println("enter Student id");
			int id = sc.nextInt();
			
			System.out.println("enter Student name");
			String name =sc.next();
			
			System.out.println("enter Student age");
			int age =sc.nextInt();
			
			System.out.println("enter Student Marks");
			int marks =sc.nextInt();
			hs.add(new StudentHash(id,name,age,marks));
			System.out.println("if your continue press yes");
			
			if(!sc.next().equalsIgnoreCase("yes"))
			{
				break;
			}
		}
		Iterator<StudentHash> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}
	}

