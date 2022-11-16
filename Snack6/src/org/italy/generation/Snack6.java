package org.italy.generation;

public class Snack6 {
	public static void main(String[] args) {
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		int maxNmb = Integer.MIN_VALUE;
		int minNmb = Integer.MAX_VALUE; //  
		int sumNmb1 = 0;
		int sumNmb2 = 0;
		
		for (int i = 0; i < arr1.length;i++) {
			int actualNmb1 = arr1[i];
			int actualNmb2 = arr2[i];
			
			sumNmb1 += actualNmb1;
			sumNmb2 += actualNmb2;
			
			if (minNmb > actualNmb1) {
				minNmb = actualNmb1;
			}
			if (minNmb > actualNmb2) {
				minNmb = actualNmb2;
			}
			
			if (actualNmb1 > maxNmb) {
				maxNmb = actualNmb1;
			} else if (actualNmb2 > maxNmb) {
				maxNmb = actualNmb2;
			}
		}
		
		int totalSum = sumNmb1 + sumNmb2;
		float avgNmb = ((float)totalSum) / (arr1.length + arr2.length); 

		System.out.println("Il valore minimo tra i numeri dell'array è: " + minNmb);
		System.out.println("Il valore massimo tra i numeri dell'array è: " + maxNmb);
		
		System.out.println("La media dei numeri dell'array è: " + avgNmb);
		System.out.println("La sommatoria dei numeri dei due array è: " + totalSum);

	}
}
