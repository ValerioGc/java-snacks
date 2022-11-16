package org.generation.italy;

import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		Random rnd = new Random(128);
		
		int maxValue = 0;
		int minValue = 10;
		
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(50) - 50; 
			System.out.println(numbers[i]);
		}
		
		
	}
}
