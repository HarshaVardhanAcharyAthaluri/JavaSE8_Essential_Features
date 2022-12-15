package com.javase8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
// remove the empty strings and return new list from List of strings

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("Java8");
		stringList.add("Basics");
		stringList.add("");
		stringList.add("Something");
		stringList.add("");
		stringList.add("Features");

		System.out.println("WITH EMPTY STRINGS :: " + stringList);
		System.out.println("LENGTH WITH EMPTY STRINGS :: " + stringList.size());

		List res = filterList(stringList, t -> !t.isEmpty());
		
		System.out.println("WITHOUT EMPTY STRING ::: " + res);
		System.out.println("LENGTH WITHOUT EMPTY STRINGS :: " + res.size());
		
	}

	private static List<String> filterList(List<String> list, Predicate<String> predicte) {
		List<String> resList = new ArrayList<String>();
		for (String string : list) {
			if (predicte.test(string)) {
				resList.add(string);
			}
		}
		return resList;
	}

}
