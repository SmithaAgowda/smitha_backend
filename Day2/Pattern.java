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
	
	

	public static void pattern4()
	{
		
		//ABCDE
		//ABCDE
		//ABCDE
		//ABCDE
		//ABCDE
		
		int n=5;
		int A=65;
		
		for(int i=0;i<n;i++) {
		A=65;
			for(int j=0;j<n;j++)
			{
				System.out.print((char)(A++));
				
			
				
			}
			System.out.println();
			
		}
	}
	public static void pattern6()
	{
		
	//		a a a a a
	//	    b b b b b
	//	    c c c c c
	//      d d d d d
	//		e e e e e
		
		int n=5;
		int a=97;
		
		for(int i=0;i<n;i++) {
		
		
			for(int j=0;j<n;j++)
			{
				System.out.print((char)(a));
				
				
				
			}
			System.out.println();
			a++;
		}
	}
	public static void pattern7()
	{
		
//			*
//			* *
//			* * *
//			* * * *
//			* * * * *
				
		
		int n=5;
		for(int i=1;i<=n;i++) {
		
		
			for(int j=1;j<=i;j++)
				
			{
				System.out.print("*");
				
				
				
			}
			System.out.println();
			
		}
	}
	public static void pattern8()
	{
//			* * * * *
//			* * * *
//			* * *
//			* *
//			*
//				
		
		int n=5;
		for(int i=1;i<=n;i++) {
		
		
			for(int j=n;j>=i;j--)
				
			{
				System.out.print("*");
				
				
				
			}
			System.out.println();
			
		}
	}
	public static void pattern9()
	{
//			5 5 5 5 5
//			4 4 4 4
//		 	3 3 3
//			2 2
//			1
//				
		
		int n=5;
		for(int i=n;i>=1;i--) {
		
		
			for(int j=1 ;j<=i;j++)
				
			{
				System.out.print(i + "");
				
				
				
			}
			System.out.println();
			
		}
	}
	public static void pattern10()
	{
//			1
//			2 2
//			3 3 3
//			4 4 4 4
//			5 5 5 5 5
//			
//				
		
		int n=5;
		for(int i=1;i<=5;i++) {
		
		
			for(int j=1 ;j<=i;j++)
				
			{
				System.out.print(i + "");
				
			}
				
			
			System.out.println();
			
		}
	}
	public static void pattern11()
	{
//			1 2 3 4 5
//			2 3 4 5
//			3 4 5
//			4 5
//			5
			
		
		int n=5;
		for(int i=1;i<=n;i++) 
		{
		for(int j=i ;j<=n;j++)
				
			{
				System.out.print(j + "");
				
			}
				
			
			System.out.println();
			
		}
	}
	public static void pattern12()
	{
////		  * 
//	        * * * 
//	      * * * * * 
//	    * * * * * * * 
//	  * * * * * * * * * 
		 
//				
		
		int n=5;
		for(int i=1;i<=n;i++) {
		
		
			for(int j=1 ;j<=n-i;j++)
				
			{
				System.out.print("  ");
				
			}
			for (int k=1;k<=i*2-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	public static void pattern13()
	{
//			
//             *
//	         * *
//	       * * *
//	     * * * *
//	   * * * * *
//		
		int n=5;
		for (int i = 1; i<=n; i++) {
			for (int j = n; j > 0; j--) {
				
				if (j > i) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}

			}
			System.out.println();
		}
	}
	
	public static void pattern14()
	{
//	  * * * * * * * 
//	    * * * * * 
//	      * * * 
//	        * 
//		 
//				
		
		int n=5;
		for(int i=n;i>=1;i--) {
		
		
			for(int j=1 ;j<=n-i;j++)
				
			{
				System.out.print("  ");
				
			}
			for (int k=1;k<=i*2-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	
	public static void pattern15()
	{
//	  
//		5
//		54
//		543
//		5432
//		54321
		
				
		int n=5;
		for(int i=n;i>=1;i--) 
		{
		for(int j=n ;j>=i;j--)
				
			{
				System.out.print(j + "");
				
			}
				
			
			System.out.println();
			
		}
	}
	
	public static void pattern16()
	{
//			
////    1 
//		2 6 
//		3 7 10 
//		4 8 11 13 
//		5 9 12 14 15 
//		
		int n=5;
		for (int i = 1; i<=n; i++) {
			int x=i;
			for (int j = 1; j <= i; j++) {
				
				System.out.print(x + "");
				x=x+n-j;

			}
			System.out.println();
		}
	}
	public static void pattern17()
	{
//			
/////       1 
//	      0 1 0 
//	      1 0 1 0 1 
//	    0 1 0 1 0 1 0 
//	  1 0 1 0 1 0 1 0 1 
//		
		int n=5;
		int x=1;
		for (int i = 1; i<=n; i++) {
		
			for (int j = 1; j <= n-i; j++) {
				
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1;j++)
			{
				System.out.print(x%2+ " ");
				x++;
			}
			System.out.println();
		}
	}
	
	public static void pattern18()
	{
//			
//      1 
//		2 1 
//		3 2 1 
//		4 3 2 1 
//		5 4 3 2 1 
//		
		
//		
		int n=5;
		for (int i = 1; i<=n; i++) {
		
			for (int j = i; j>=1; j--) {
				
			System.out.print(j+ " ");
			}
			
			System.out.println();
		}
	}
	
	
	public static void pattern19()
	{
//			
//             *
//	         * *
//	       * * *
//	     * * * *
//	   * * * * *
//		
		int n=5;
		for (int i = 1; i<=n; i++) {
			for (int j = n; j > 0; j--) {
				
				if (j > i) {
					System.out.print("");
				} else {
					System.out.print(i);
				}

			}
			System.out.println();
		}
	}
	
	public static void pattern20()
	{
//			
//            1 
//		    1 2 1 
//		  1 2 3 2 1 
//		 1 2 3 4 3 2 1 
//		1 2 3 4 5 4 3 2 1 
////		
		int n = 5;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = i; j < n; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) 
            {
                System.out.print(k);
            }
            for (int l = i; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
	
	
	
	
	public static void pattern21()
	{
////	    1
//		   121
//		   12321
//		  1234321
//		 123454321	
//            
//		
////		
		int n=5;
		for (int i = 1; i<=n; i++) {
			for (int j = n; j > 0; j--) {
				
				if (j > i) {
					System.out.print("");
				} else {
					System.out.print(i);
				}

			}
			System.out.println();
		}
	}
	
	
	public static void pattern22()
	{
//   	    1
//		   212
//		   32123
//		  4321234
//		 543212345

//            
//		
////		
		   int n = 5;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = n; j >= 1; j--) 
            {
                if (j <= i) 
                {
                    System.out.print(j);
                } else 
                {
                    System.out.print(" ");
                }
            }
            for (int k = 2; k <= i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
	

	public static void pattern23()
	{
//      1 1 1 1 1 
//		2 2 2 2 
//		3 3 3 
//		4 4 
//		5 

//            
//		
////	
			int n=5;
			for(int i=1;i<=n;i++) 
			{
				
				for(int j=n;j>=i;j--) 
				{
					
					System.out.print(i + " ");
				}
				System.out.println();
				
			}
		}
	
	public static void pattern24()
	{
//          1 
//	      1 2 3 
//	      1 2 3 4 5 
//	    1 2 3 4 5 6 7 
//	  1 2 3 4 5 6 7 8 9 
//		
        	int n=5;
			
			for(int i=1;i<=n;i++) 
			{
				int num=1;
				for(int j=1;j<=n-i;j++)
				{	
					System.out.print("  ");
				}
				for(int j=1;j<=i*2-1;j++)
				{	
					System.out.print(j+" " );
					
				}
				System.out.println();
			}
	}
	
	public static void pattern25()
	{
//   
//	        1 
//	      0 0 0 
//	    1 1 1 1 1 
//	  0 0 0 0 0 0 0 
//	1 1 1 1 1 1 1 1 1 
//		
		
			int n=5;
			for(int i=1;i<=n;i++)
			{
				
				for(int j=1;j<=n-i;j++)
				{	
					System.out.print("  ");
				}
				for(int j=1;j<=i*2-1;j++) 
				{	
					if(i%2==0) {
						System.out.print("0"+" " );
					}
					else {
						System.out.print("1"+" " );
					}
					
				}
				System.out.println();
	}
	}
	
	public static void pattern26() 
	{
		
//        1
//      2 1
//    3 2 1
//  4 3 2 1
//5 4 3 2 1
		
		
		
		
		int n=5;
		for (int i=1; i<=n; i++) 
		{
			for (int j=n; j>=1; j--) 
			{
				
				if (j > i)
				{
					System.out.print("  ");
				} else 
				{
					System.out.print(" "+j);
				}

			}
			System.out.println();
		}
		
	}
	
	public static void pattern5()
	{
		
//		54321
//		54321
//		54321
//		54321
//		54321
		
		int n=5;
		for(int i=5;i<1;i++)
		{
			for(int j=5;j<1;j++)
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
	
	public static void pattern27() 
	{
//		1,1 2,1 3,1 4,1 5,1 
//		1,2 2,2 3,2 4,2 5,2 
//		1,3 2,3 3,3 4,3 5,3 
//		1,4 2,4 3,4 4,4 5,4 
//		1,5 2,5 3,5 4,5 5,5 
		
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

	public static void pattern28() 
	{
//		1 0 1 0 1 
//		1 0 1 0 1 
//		1 0 1 0 1 
//		1 0 1 0 1 
//		1 0 1 0 1 
		
		
		
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

	public static void main(String[] args)
	{
//	 patter1();
//	 patter2();
//	 patter3();
//	 pattern4();
//	 pattern5();
	// pattern6();
		//pattern7();
//		pattern8();
		//pattern9();
//		pattern10();
	//	pattern11();
	//pattern12();
//	pattern13();
//		pattern14();
	//	pattern15();
	//	pattern16();
	//	pattern17();
	//	pattern18();
	//p	pattern19();
	//pattern20();
		//pattern21();
		//pattern22();
		//pattern23();
		//pattern24();
		//pattern25();
		//pattern26();
		pattern27();
		//pattern28();
		
}
}
