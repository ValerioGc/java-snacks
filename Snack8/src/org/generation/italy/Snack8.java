package org.generation.italy;

import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		Random rnd = new Random(128);
		
		int maxValue = 0;
		int minValue = 10;
		int sumMFive = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(100) - 50; 
			System.out.println(numbers[i]);
			if ((numbers[i] % 5) == 0) {
				sumMFive += (int)numbers[i];
			}
		}
		System.out.println("somma numeri:" + sumMFive);
	}
}
