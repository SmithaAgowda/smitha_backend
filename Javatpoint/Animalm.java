package com.demo;

public class Animalm
{  
void eat()
{
	System.out.println("eating...");
	}  
}  
class Dogs extends Animalm
{  
void bark(){
	System.out.println("barking...");
	}  
}  
class BabyDog extends Dogs
{  
void weep()
{
	System.out.println("weeping...");
	}  
}  
class TestInheritance2
{  
public static void main(String args[])
{  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}
}  