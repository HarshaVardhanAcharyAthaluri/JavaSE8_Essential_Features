package com.javase8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
				intList.add(52);
				intList.add(65);
				intList.add(89);
				intList.add(44);
				intList.add(12);
				intList.add(7);
	
	intList.stream().filter(t-> t%2==0).forEach(System.out::println);
	
	List<Book> booksList = new ArrayList<Book>();
	
	Book beatyandbeast = new Book("BeastAndButy","Jack fedric", "Horror", 4);
	Book NoteBook = new Book("NoteBook","aswincolor", "Romantic", 3);
	Book GirlInNextDoor = new Book("GirlInNextDoor","Checthanbhagath", "Romantic", 2);
	Book apocolptus = new Book("Apocolptus","adamSnitch", "fiction", 4.5);
	Book avintilla = new Book("Avintilla","samsnad", "Horror", 5);
	Book pradilla = new Book("Pradilla","amyklenter", "Horror", 2);
	
	booksList.add(beatyandbeast);
	booksList.add(NoteBook);
	booksList.add(GirlInNextDoor);
	booksList.add(apocolptus);
	booksList.add(avintilla);
	booksList.add(pradilla);
	
	booksList.stream().filter(t -> t.getGenre().equalsIgnoreCase("horror")).map(t->t.getTitle()).forEach(System.out::println);
	
	Map<String, Long> bookamp= booksList.stream().collect(Collectors.groupingBy(Book::getGenre,Collectors.counting()));
	 
	System.out.println(bookamp);
				
				
				
		
		
	}

}
