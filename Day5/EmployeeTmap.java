package com.demo;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
public class EmployeeTmap 
{


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Comparator<Integer> com =new Comparator<Integer>() {

		
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return (o1).compareTo(o2);
			}
			
		};
		
		TreeMap<Integer,EmployeeTree> tm=new TreeMap<>(com);
		
		while(true)
		{
            System.out.println("enter employee id");
			int id = sc.nextInt();
			System.out.println("enter employee name");
			
			String name =sc.next();
			System.out.println("enter employee Salary");
			double sal =sc.nextDouble();
			System.out.println("if your continue press yes");
		
			tm.put(id,new EmployeeTree(id,name,sal));
			if(!sc.next().equalsIgnoreCase("yes"))
			{
				break;
			}
		}
        Set<Entry<Integer,EmployeeTree>> entrySet = tm.entrySet();
		
		for(Entry<Integer,EmployeeTree>entry:entrySet)
		{
			System.out.println(entry.getKey() + "------>" + entry.getValue());
		}
	
	}

}
