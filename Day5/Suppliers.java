package com.demo;

import java.util.function.Supplier;

public class Suppliers {

	
	public static void main(String[] args)
	{
//		Supplier<String> otp =()-> {
//			String s ="";
//			
//			for(int i=0;i<6;i++)
//			{
//				s=s+(int)(Math.random()*18);
//			}
//			
//			return s;
//		};
//		System.out.println(otp.get());
		
		
		Supplier<Double> otp =()-> Math.random();{
			System.out.println(otp.get());
		}
}
}
	
