package com.javase8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
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
		
		List<Book> horrBooks = new ArrayList<Book>();
		
		 Iterator<Book> it= booksList.iterator();
		 
		 while(it.hasNext()) {
			 Book b = it.next();
			 if( b.getGenre().equalsIgnoreCase("Horror")&&b.getRating()>3) {
				 horrBooks.add(b);
			 }
		 }
		 
		 System.out.println("Without Stream :: "+horrBooks);
		 // java8 
		 List<Book> horrobookssteam = booksList.stream().filter(book->book.getGenre().equalsIgnoreCase("Horror")&book.getRating()>3).collect(Collectors.toList());
		 System.out.println("With Stream ::"+horrobookssteam);
		 
		 
		 
	}
}
