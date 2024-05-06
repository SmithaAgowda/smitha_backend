package com.demo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class EmployeeStringTree {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Comparator<String> com =new Comparator<String>() {

		
			@Override
			public int compare(String o1, String o2) {
				
				return (o1).compareTo(o2);
			}
			
		};
		
//		Comparator<Integer> com = Comparable::compareTo;
//		TreeMap<Integer,EmployeeTree> tm=new TreeMap<>(com);
		TreeMap<String,EmployeeTree> tm=new TreeMap<>(com);
		
		
		//string lamda expression
//		TreeMap<String,EmployeeTree> tm1=new TreeMap<>((o1,o2)->o1.compareTo(o2));
		
		//using refference
		
//		TreeMap<String,EmployeeTree> tm2=new TreeMap<>(comparator::compare);
		
		while(true)
		{
            System.out.println("enter employee id");
			int id = sc.nextInt();
			System.out.println("enter employee name");
			
			String name =sc.next();
			System.out.println("enter employee Salary");
			double sal =sc.nextDouble();
			System.out.println("if your continue press yes");
		
			tm.put(name,new EmployeeTree(id,name,sal));
			if(!sc.next().equalsIgnoreCase("yes"))
			{
				break;
			}
		}
        Set<Entry<String,EmployeeTree>> entrySet = tm.entrySet();
		
		for(Entry<String,EmployeeTree>entry:entrySet)
		{
			System.out.println(entry.getKey() + "------>" + entry.getValue());
		}
	
	}
}
