package com.demo;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String str="abc";
		char ch;
		String rstr="";
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rstr=ch+rstr;
		}
		System.out.println(rstr);
	}

}
