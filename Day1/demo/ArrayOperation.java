package com.demo;

import java.util.Scanner;

public class ArrayOperation {
	
	public static void createArray() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		System.out.println("enter the array element");
		for(int i =0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(numbers[i]);
		}
	}

	
	public static void printArray()
	{
		int[] array = {5,6,8,9,10};
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i] + "");
		}
	}
	
	public static void reverseArray()
	{
		int[] array = {2,5,7,8,11};
	
		for(int i=0;i<array.length/2;i++)
		{
			int temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
	
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	
	}
	
	public static void mergeArray(int array1[],int array2[])
	{
		int[] array3 = new int[array1.length+array2.length];
		int j=0;
		
		for(int i =0;i<array3.length;i++)
		{
			if(i<array1.length)
			{
				array3[i] =array1[i];
			}
			else
			{
				array3[i] =array2[j++];
			}
		}
		
		for(int i=0;i<array3.length;i++)
		{
			System.out.println(array3[i]);
		}
			
	}
	public static void unionArray(int arr1[],int arr2[])
	{
		int[] arr3 = new int[arr1.length+arr2.length];
		int j=0,i=0,k=0; 
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				arr3[k++]=arr1[i++];
				j++;
			}
			else if(arr1[i]<arr2[j])
			{
				arr3[k++]=arr1[i++];
			}
			else {
				arr3[k++]=arr2[j++];
			}
		}
		while(i<arr1.length)
		{
			arr3[k++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			arr3[k++]=arr2[j++];
		}
		for(int value:arr3)
		{
			if(value!=0)
			{
				System.out.println(value + "");
			}
		}
	}
	
	public static void intersectionArray()
	{
//		int[] arr3 = new int[arr1.length+arr2.length]
	}
	
	public static void maxArray()
	{
		int[] arr = {15,25,35,40};
		
 		int max= arr[0];
 		
 		for(int i=0;i<arr.length;i++)
 		{
 			if(arr[i]>max)
 			{
 				max =arr[i];
 			}
 			
 		}
 		System.out.println(max);
	}
	
	public static void minArray()
	{
		int[] arr = {15,25,35,40};
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min =arr[i];			}
		}
		System.out.println(min);
	}
	
	public static void sortArray(int arr[])
	
	
	{
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
	

	
	public static void main(String[] args){
		
//		System.out.println("hello world");
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("enter the size of an array");
//		int size = scanner.nextInt();
//		int[] numbers = new int[size];
//		System.out.println("enter the array element");
//		for(int i =0; i<size;i++)
//		{
//			numbers[i]=scanner.nextInt();
//		}
		
	//	createArray();
	//	reverseArray();
	//	sortArray(numbers);
//		maxArray();
//		minArray();
		
//		int[] array1 = {1,3,5};
//		int[] array2 = {6,7,8};
//		
//		mergeArray(array1,array2);
		//printArray();
		int[] arr1 = {2,6,8,9};
		int[] arr2 = {4,9,8,7,9};
		unionArray(arr1,arr2);
		
}
}