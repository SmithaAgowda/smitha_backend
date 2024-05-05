package com.demo;

public class AnimalSuperkeyword
{
	String color="white";  
	}  
	class Do extends AnimalSuperkeyword
	{  
	String color="black";  
	void printColor(){  
	System.out.println(color);//prints color of Dog class  
	System.out.println(super.color);//prints color of Animal class  
	}  
	}  
	class TestSuper1
	{  
	public static void main(String args[])
	{  
	Do d=new Do();  
	d.printColor();  
	}
	}  

