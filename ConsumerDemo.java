package com.javase8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		List<String> StringList = new ArrayList<String>();
		StringList.add("KitKat");
		StringList.add("DairyMilk");
		StringList.add("5Star");
		StringList.add("Munch");
		StringList.add("Perk");
		
		Consumer<String> consumer =  System.out::println;
		
		consumer.accept("Demo Consumer");
		
		printList(StringList, consumer);
	}
	
	private static void printList(List<String> list,Consumer<String> consumer) {
		for (String st : list) {
			consumer.accept(st);
		}
	}
}
