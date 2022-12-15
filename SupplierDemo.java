package com.javase8features;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
	
		Supplier<Double> supplier1 = () -> Math.random(); 
		
		System.out.println(" Random Double :: "+supplier1.get());	
		
		Supplier<String> supplier = () -> UUID.randomUUID().toString(); 
		
		System.out.println(" Random UUID :: "+supplier.get());	
		
	}
}
