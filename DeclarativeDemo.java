package com.javase8features;

import java.util.stream.IntStream;

public class DeclarativeDemo {

	public static void main(String[] args) {
		
		 int evenSum= IntStream.range(0, 100).filter(i->i%2==0).reduce((x,y)->x+y).getAsInt();
		
		 System.out.println("Sum of Even Numbers Decarative Style :: "+ evenSum);
		
	}
}
