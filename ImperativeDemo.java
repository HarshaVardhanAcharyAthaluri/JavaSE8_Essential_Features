package com.javase8features;

public class ImperativeDemo {

	// sum of even numbers of 1 to 100

	public static void main(String[] args) {
		int sumOfEven = 0;

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {
				sumOfEven = sumOfEven + i;
			}
		}
		System.out.println("Sum of Even Numbers :: " + sumOfEven);

	}

}
