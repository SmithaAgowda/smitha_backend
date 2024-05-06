package com.demo;

  
abstract class Bike4
{  
 Bike4()
 {
	 System.out.println("bike is created");
	 }  
 abstract void run();  
 void changeGear()
 {
	 System.out.println("gear changed");
	 }  
}  

class Honda extends Bike4
{  
void run()
{
	System.out.println("running safely..");
	}  
}  

class TestAbstraction2{  
public static void main(String args[]){  
Bike4 obj = new Honda();  
obj.run();  
obj.changeGear();  
}  
}  
