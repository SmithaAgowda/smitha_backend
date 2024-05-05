package com.demo;

class A
{  
void msg()
{
	System.out.println("Hello java");
}  
}  
  
public class PrivateAccessSpecifier extends A
{  
void msg()
{
	System.out.println("Hello java");
	}

 public static void main(String args[])
 {  
   PrivateAccessSpecifier obj=new PrivateAccessSpecifier();  
   obj.msg();  
   }  
}  
