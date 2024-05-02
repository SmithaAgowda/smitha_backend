package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain2 {
	
	public static void main(String[] args)
	{
		List<EmployeeDetails> employeeDetails = new LinkedList<>();
		
		while(true) 
		{
			Scanner  sc = new Scanner(System.in);
			System.out.println("enter employee id");
			
			int id = sc.nextInt();
			System.out.println("enter employee name");
			
			String name =sc.next();
			System.out.println("enter employee Salary");
			
			float sal =sc.nextFloat();
			employeeDetails.add(new EmployeeDetails(id,name,sal));
			
			System.out.println("if your continue press yes");
			
			if(!sc.next().equalsIgnoreCase("yes"))
			{
				break;
			}
			
		
			
		}
		Collections.sort(employeeDetails,(d1,d2)->(d1.getName()).compareTo(d2.getName()));
		employeeDetails.forEach(System.out::println);
	
	}

}
