package com.demo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamProgram {
	
	public static void main(String[] args)
	{
		
		// Duplicate value with occurence
//		List<String> names = Arrays.asList("AA","BB","AA","CC");
//		names.stream().filter(e->Collections.frequency(names, e)>1)
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//	-------------------------------------------------------------------------------------------------------------------------------------	
		List<Integer> num = Arrays.asList(1,2,4,4,6,8,15,25);
		List<Integer> num1 = Arrays.asList(2,5,6,8,9,15);
		
		//print even number
//		 List<Integer> collect= num.stream().filter(i->i%2==0).collect(Collectors.toList());
//		
//		 System.out.println(collect);
//-------------------------------------------------------------------------------------------------------------------------------------------
		//cube on list element and filter numbers greaterthan 50
//		num.stream().map(e->e*e*e).filter(e->e>50).forEach(System.out::println);
//		-----------------------------------------------------------------------------------------------------------------------------------
		
		//print count of each character in a string
//		String input = "asddjklsdjklk";
//		Map<Character,Long> collect=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); 
//		System.out.println(collect);
//	-----------------------------------------------------------------------------------------------------------------------------------------
		//Print Multiple of 5 from the List
//		List<Integer> collect =num.stream().filter(i->i%5==0).collect(Collectors.toList());
//		System.out.println(collect);
//		-------------------------------------------------------------------------------------------------------------------------------------
		//Remove Duplicates element from array
//		List<Integer> collect = num.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect);
//	-----------------------------------------------------------------------------------------------------------------------------------------	
		
		//Frequency of each character in an array
//		Map<Integer,Long> collect = num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
		
//		-----------------------------------------------------------------------------------------------------------------
		//count arraylist
//		System.out.println(num.stream().count());
//	---------------------------------------------------------------------------------------------------------------	
		
		//Starts with 1
//		num.stream().map(e->Integer.toString(e)).filter(e->e.startsWith("1")).forEach(System.out::print);
//		-----------------------------------------------------------------------------------------------------------
		//Sorted order
//		num.stream().sorted().forEach(System.out::println);
		
//		--------------------------------------------------------------------------------------------------------------------
		//Reverse order
//		num.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//	-----------------------------------------------------------------------------------------------------------------------	
//		common Elements between two arrays
//		num.stream().filter(num1::contains).forEach(System.out::println);
//		-----------------------------------------------------------------------------------------------------
//		two min numbers
//		num.stream().sorted().limit(2).forEach(System.out::println);
//		-----------------------------------------------------------------------------------------------------------------
//		two max number
//		num.stream().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);
		
//		-------------------------------------------------------------------------------------------------------------------
		//merge two unsorted arrays into single sorted array without duplicates
	//	int[] num2 = {2,4,5,6,3,8};
//		int[] num3 = {1,7,9,3};
//		
//        int[]	collect1=	IntStream.concat(Arrays.stream(num2), Arrays.stream(num3)).sorted().distinct().toArray();
//		System.out.println(Arrays.toString(collect1));
//		-----------------------------------------------------------------------------------------------------------------
		
	//	merge two unsorted arrays into single sorted array
//		int[] num2 = {2,4,5,6,3,8};
//		int[] num3 = {1,7,9,3};
	
//        int[]	collect1=	IntStream.concat(Arrays.stream(num2), Arrays.stream(num3)).sorted().toArray();
//		System.out.println(Arrays.toString(collect1));
//		-----------------------------------------------------------------------------------------------------------------	
		//Sum  and Average of all Elements of an Array
//		int collect = Arrays.stream(num2).sum();
//		
//		System.out.println(collect);
//		
//		
//		double collect1 = Arrays.stream(num2).average().getAsDouble();
//		System.out.println(collect1);
		
//		-----------------------------------------------------------------------------------------------------------------
		//Sort List of String in increasing order
//		List<String> str = Arrays.asList("smithagowda","anoop","yatharth");
//		str.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
		
		//Last element of an array
//		List<String> str = Arrays.asList("ss","aa","cc");
//	 System.out.print(str.stream().skip(str.size()-1).findFirst().get());
//		-----------------------------------------------------------------------------------------------------------------
		
		//palindrome
//		String str1 ="ab";
//	System.out.print(IntStream.range(0, str1.length()/2).noneMatch(i->str1.charAt(i)!=str1.charAt(str1.length()-i-1)));
//		-----------------------------------------------------------------------------------------------------------------	
		
		//join List of Strings with prefix suffix and delimiter 
//		List<String> str = Arrays.asList("smitha");
//		System.out.println(str.stream().collect(Collectors.joining("2","mrs","mg")));
		
//		-----------------------------------------------------------------------------------------------------------------
		//min and max element
//		List<Integer> num8= Arrays.asList(1,2,5,8);
//	System.out.println(num8.stream().max(Comparator.naturalOrder()).get());
//	
//	System.out.println(num8.stream().min(Comparator.naturalOrder()).get());
//		-----------------------------------------------------------------------------------------------------------------	
		//Anagram
		
//		String s1="silent";
//		String s2="listn";
//		
//		s1=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
//		s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
//		System.out.println(s1.equals(s2));
//		-----------------------------------------------------------------------------------------------------------------	
       //sum of digits
		int num12 = 256314;
		int num11 = Stream.of(String.valueOf(num12).split(""))
				.collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println(num11);
		
//		int num9=Stream.of(String.valueOf(num2).split("")).collect(Collectors.summingInt(Integer::parseInt));
//		System.out.println(num9);
		
//		-----------------------------------------------------------------------------------------------------------------
		//second Largest number
//		System.out.println(num1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
//		-----------------------------------------------------------------------------------------------------------------
		//common Element between two Arrays
//		List<Integer> arr = Arrays.asList(4,5,6,7,8,9);
//		List<Integer> arr2 = Arrays.asList(8,9,7,4,5,6,2);
//		
//		arr.stream().filter(arr2::contains).forEach(System.out::println);
//		-----------------------------------------------------------------------------------------------------------------	
//		
//		Reverse Each Word of a string
//		String str1 ="smitha";
//		System.out.println(Arrays.stream(str1.split(""))
//				.map(word->new StringBuffer(str1).reverse())
//				.collect(Collectors.joining(" ")));
		
		
		//Age of person in years
//		LocalDate birthDay = LocalDate.of(1985, 01, 23);
//		LocalDate today= 	LocalDate.now();
//		System.out.println(ChronoUnit.YEARS.between(birthDay,today));

		//sum of first 10 natural numbers
//		System.out.println(IntStream.range(1,11).sum());
		
		
		//find String which Start with number
//		List<String> st = Arrays.asList("2smi","smi5");
//		st.stream().filter(str-> Character.isDigit(str.charAt(0))).forEach(System.out::println);
		
		
		//Find duplicate elements from an array
//		Set<Integer> set = new HashSet<>();
//		List<Integer> n = Arrays.asList(1,5,5,6,7,7,9);
//		System.out.println(n.stream().filter(i-> ! set.add(i))
//		.collect(Collectors.toSet()));
		
		
		//Fiboncci
//		Stream.iterate(new int[] {0,1},f->new int[] {f[1],f[0]+f[1]})
//		.limit(10)
//		.map(f->f[0])
//		.forEach(i->System.out.println(i+""));
			
	
}
}	
