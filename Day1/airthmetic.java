package com.demo;

import java.util.Arrays;

public class airthmetic {
	
	public static int[] merge(int[] a,int[] b)
	{
		int c[]=new int[a.length+b.length];
		int temp=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else {
				c[i]=b[temp++];	
			}
		}
		return c;
	}
	


	public static int[] intersection(int[] a,int[] b)
	{
		int[] res=merge(a,b);
		int[] t =new int[res.length];
		int count =0;
		
		for(int i=0;i<res.length;i++)
		{
			t[i]=1;
			for(int j=i+1;j<res.length;j++)
			{
				if(res[i]!=-1 && res[j]!=-1 && res[i]==res[j])
				{
					res[j]=-1;
					t[i]++;
				}
			}
			if(t[i]>=2)
			{
				count++;
			}
		}
		int intersec[] =new int[count];
		int temp =0;
		for(int i=0; i<res.length;i++)
		{
			if(res[i]!=-1 && t[i]>=2)
			{
				intersec[temp++]=res[i];
			}
		}
		return intersec;
	}
	
	
	public static void removeDuplicatesFromArray(int arr[])
	{
		int count = 0;
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]!= -1 && arr[j]!=-1 && arr[i] == arr[j] ) 
				{
					arr[j] = -1;
					count++;
				}			
			}
		}
	
		int resarr[] = new int[arr.length-count];
		int x=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]!=-1)
			{
				resarr[x++] = arr[i];	
			}	
		}
	
		System.out.println("New Array After Removing duplicates : " + Arrays.toString(resarr));
		
	}
	
	public static void primecount(int b[])
	{
		int count = 1;
		for(int i = 2; i < b.length; i++)
		{
			if(b[i] % 2 != 0)
			{
				count++;
			}
		}
		
		System.out.println("Prime number Count is :" + count);
	}
	
	public static void zigZag(int a[])
    {
        // Flag true indicates relation "<" is expected,
        // else ">" is expected. The first expected relation
        // is "<"
        boolean flag = true;

        int temp = 0;

        for (int i = 0; i <= a.length - 2; i++) {
            if (flag) /* "<" relation expected */
            {
                /* If we have a situation like A > B > C,
                we get A > C < B by swapping B and C */
                if (a[i] > a[i + 1]) {
                    // swap
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            else /* ">" relation expected */
            {
                /* If we have a situation like A < B < C,
                we get A < C > B by swapping B and C */
                if (a[i] < a[i + 1]) {
                    // swap
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            flag = !flag; /* flip flag */
        }
        System.out.println(Arrays.toString(a));
    }
	
	
	public static void occurance(int arr[])
	{
  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }
	
	

	public static void main(String[] args)
	{
		int[] a = {1,2,2,5,6,8};
		int[] b = {1,3,5,7,8};
		int[] intersec= intersection(a,b);
		int[] arr = {1,2,5,2,6,1,8,5,2};
		int[] arr1 = {2,4,3,9,4,3,12,2,1};
		System.out.println("intersection:" + Arrays.toString(intersec));
		removeDuplicatesFromArray(arr);
		primecount(b);
		occurance(a);
		zigZag(a);
	}
}