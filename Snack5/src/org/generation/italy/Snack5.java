package org.generation.italy;
public class Snack5 {
	public static void main(String[] args) {
		int[] arrayN = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int maxNmb = 0;
		int minNmb = 10; // 
		int sumNmb = 0;
		for (int i = 0; i < arrayN.length;i++) {
			int actualNmb = arrayN[i];
			sumNmb += actualNmb;
			if (actualNmb < minNmb) {
				minNmb = actualNmb;
			} else if (maxNmb < actualNmb) {
				maxNmb = actualNmb;
			}
		}		
		float avgNmb =  ((float)sumNmb) / arrayN.length; 
		
		System.out.println("Il valore minimo tra i numeri dell'array è: " + minNmb);
		System.out.println("Il valore massimo tra i numeri dell'array è: " + maxNmb);
		System.out.println("La media dei numeri dell'array è: " + avgNmb);
		System.out.println("La sommatoria dei numeri dell'array è: " + sumNmb);
	}
}
