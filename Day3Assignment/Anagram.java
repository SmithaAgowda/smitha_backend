package com.demo;



import java.util.Arrays;

public class Anagram 
{
	
	public static void main(String[] args)
	{
	
		String S1 = "Listen";
		String S2 = "Silent";
	
		char c1[] = S1.toLowerCase().toCharArray(); 
		char c2[] = S2.toLowerCase().toCharArray();
	
		if(c1.length != c2.length)
		{
			System.out.println("Not an anagram");
			return; 
		}
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i = 0; i < c1.length; i++)
		{
			if(c1[i] != c2[i])
			{
				System.out.println("Not an anagram");
				return;
			}
		}
		
		System.out.println("Anagram");
	}
}

