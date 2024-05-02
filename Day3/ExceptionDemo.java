package com.demo;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		try
		{
			int n =100/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
