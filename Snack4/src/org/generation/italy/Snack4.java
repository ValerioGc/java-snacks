package org.generation.italy;

import java.util.Random;

public class Snack4 {
	public static void main(String[] args) {
		int[] numbersArr = new int[24];
		int[] numbersArr2 = new int[52];
		Random rnd = new Random();

		int differenceIndex = numbersArr2.length - numbersArr.length;
		System.out.println("Quantità numeri randomici:" + differenceIndex);
		for ( int x = 0; x < differenceIndex;x++){
			int rndNumb = rnd.nextInt(10) + 1;
			System.out.println("numero randomico:" + rndNumb);

		}
	}
}
