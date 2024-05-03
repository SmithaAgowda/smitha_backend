package com.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Register {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		Comparator<EmployeeHash> com =new Comparator<EmployeeHash>() {
//
//			@Override
//			public int compare(EmployeeHash o1, EmployeeHash o2) {
//				
//				return((Integer)o1.id).compareTo(o2.id);
//			}
//			
//		};
		
		TreeSet<EmployeeHash> emp=new TreeSet<EmployeeHash>((e1,e2) ->e1.id-e2.id);
		
		while(true)
		{
            System.out.println("enter employee id");
			int id = sc.nextInt();
			System.out.println("enter employee name");
			
			String name =sc.next();
			System.out.println("enter employee Salary");
			double sal =sc.nextDouble();
			System.out.println("if your continue press yes");
			emp.add(new EmployeeHash(id,name,sal));
			if(!sc.next().equalsIgnoreCase("yes"))
			{
				break;
			}
		}
		Iterator<EmployeeHash> itr = emp.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
