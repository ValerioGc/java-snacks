package org.generation.italy;

import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		Random rnd = new Random(128);
		
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		int sumMFive = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(100) - 50; 
			
			if ((Math.abs(numbers[i]) < minValue) || (Math.abs(numbers[i]) < 0)) {
				minValue = (Math.abs(numbers[i]));
			}
			if ((Math.abs(numbers[i]) > maxValue)) {
				maxValue = (Math.abs(numbers[i]));
			}
			
			if ((numbers[i] % 5) == 0) {
				sumMFive += numbers[i];
			}
		}
		
		System.out.println("Il numero assoluto più grande è: " + maxValue);
		System.out.println("Il numero assoluto più piccolo è: " + minValue);
		System.out.println("La somma dei numeri multipli di 5 è: " + sumMFive);
	}
}
