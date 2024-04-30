package com.demo;

public class Pattern {
	
	public static void patter1()
	{
//		11111
//		22222
//		33333
//		44444
//		55555
		
		
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i);
		
				
			}
			System.out.println();
		}
		
		System.out.println("=========================");
	}

	public static void patter2()
	{
		
//		12345
//		12345
//		12345
//		12345
//		12345
		  
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j);
		
				
			}
			System.out.println();
		}
		System.out.println("=========================");
	}
	public static void patter3()
	{
//		1
//		23
//		345
//		4567
//		56789
//		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k =i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++ + "");
		
				
			}
			System.out.println();
		}
		System.out.println("=========================");
	}

	public static void pattern4() 
	{
		int n=5;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				if(j%2==0) 
				{
					System.out.print("0"+" ");
				}
				else 
				{
					System.out.print("1"+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern5() 
	{
		int n=5;
		for(int i=1;i<=n;i++) 
		{
		
			for(int j=1;j<=n;j++) 
			{
				System.out.print(j + "," + i + " ");	
			}
			System.out.println();
		}
	}


	public static void main(String[] args)
	{
	 patter1();
	 patter2();
	 patter3();
	 patter4();
	 patter5();
}
}
