package com.demo;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaps {




	public static void main(String[] args)
	{
		
		
		HashMap<Integer,Emp> marks = new HashMap<>();
		
//		Emp e = new Emp(1,"Antony","Sales","Manager");
		Emp e1 = new Emp(10,"Diya","Sales","Accountant");
		Emp e2 = new Emp(5,"smi","Sales","Accountant");
		
		marks.put(1,new Emp(1,"jof","sales","msa"));
		marks.put(10,e1);
		marks.put(5,e2);
	
		Set<Entry<Integer,Emp>> entrySet = marks.entrySet();
		
		for(Entry<Integer,Emp>entry:entrySet)
		{
			System.out.println(entry.getKey() + "------>" + entry.getValue());
		}
	
	
	}
	
	
	
}
