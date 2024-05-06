package com.demo;


	abstract class Bike1
	{  
		  abstract void run();  
		}  
		class Honda4 extends Bike1
		{  
		void run()
		{
			System.out.println("running safely");
			}  
		public static void main(String args[])
		{  
		 Bike1 obj = new Honda4();  
		 obj.run();  
		}  
		}  
