package com.javase8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> func = t -> t.length();
		System.out.println(func.apply("Java8"));

		List<String> stringList = new ArrayList<String>();

		stringList.add("MilkShake");
		stringList.add("Smoothie");
		stringList.add("PanCake");
		stringList.add("Tea");
		stringList.add("Coffe");

		List<Integer> intList = getIntLenghts(stringList, func);

		System.out.println(" String List :: " + stringList);
		System.out.println(" Integer List :: " + intList);

	}

	private static List<Integer> getIntLenghts(List<String> stringList, Function<String, Integer> func) {
		List<Integer> intLIst = new ArrayList<Integer>();
		for (String item : stringList) {
			int legth = func.apply(item);
			intLIst.add(legth);
		}
		return intLIst;
	}
}
