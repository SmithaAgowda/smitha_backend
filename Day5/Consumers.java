package com.demo;

import java.util.function.Consumer;

public class Consumers {

	
	public static void main(String[] args)
	{
		Consumer<String> f = s ->System.out.println(s);
		Consumer<String> f1 =s->System.out.println(s.length());
		f.accept("Disha");
		f.andThen(f1).accept("Smitha");
	}
}
