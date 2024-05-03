package com.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EmployeeHash {

	int id;
	String name;
	double sal;
	
	
	public EmployeeHash(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	
	@Override
	public String toString() {
		
		return this.id + "" + this.name + "" + this.sal;
	}
	
	@Override
	public int hashCode() {
		
		return this.id;
	}
	
	@Override
	public boolean equals(Object e) {
		
		EmployeeHash emp =(EmployeeHash)e;
		return this.hashCode() ==emp.hashCode();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Set<EmployeeHash>hs = new HashSet<>();
		
		while(true) 
		{
			
			System.out.println("enter employee id");
			
			int id = sc.nextInt();
			System.out.println("enter employee name");
			
			String name =sc.next();
			System.out.println("enter employee Salary");
			double sal =sc.nextDouble();
			System.out.println("if your continue press yes");
			hs.add(new EmployeeHash(id,name,sal));
			if(!sc.next().equalsIgnoreCase("yes"))
			{
				break;
			}
		}
		
		Iterator<EmployeeHash> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}


