package com.demo;

import java.util.Scanner;

public class Test {
	
	
	public static void arrayAscending(int arr[]) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int tmp =arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("----------------------------");
	}
	
	
	public static void main(String[] args)
	{
		
	
		System.out.println("hello world");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the size of an array");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		System.out.println("enter the array element");
		for(int i =0; i<size;i++)
		{
			numbers[i]=scanner.nextInt();
		}
//		for(int i =0;i<size;i++)
//		{
//			System.out.println(numbers[i]);
//			
//		}
//		int[] values =new int[]
//	
//		for(int i=0;i<=3;i++)
//		{
//			
//		System.out.println(numbers[i]);
		arrayAscending(numbers);
//		}
	}
	

}
 