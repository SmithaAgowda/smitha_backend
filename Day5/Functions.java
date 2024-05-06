package com.demo;

import java.util.function.Function;

public class Functions {
	
	public static void main(String[] args) {
		
		Function<String,Integer>f = s->s.length();
		Function<String, Integer>f1=String::length;
		Function<String,String>f2=s->s.toUpperCase();
		System.out.println(f2.andThen(f).apply("smitha"));
	}


}
