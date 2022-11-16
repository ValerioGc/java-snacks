package org.generation.italy;

public class snack3 {
	public static void main(String[] args) {
		int[] numbersArr = new int[51];
		int limit = 50;
		int oddSum = 0;
		int elementIndex = 0;
		for (int i = 1; i <= limit;i++) {
			elementIndex = numbersArr[i];
			elementIndex = i;
			if (elementIndex % 2 != 0) {
				oddSum += elementIndex;
				System.out.println("numero dispari: " + elementIndex);
			}
		}
		System.out.println("La somma dei numeri dispari è: " + oddSum);
	}
}
