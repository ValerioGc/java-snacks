package org.generation.italy;

import java.util.Scanner;

public class snack1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("inserisci un intero");
		int userNumber = scn.nextInt();
		scn.close();
		if (userNumber % 2 == 0) {
			System.out.println("L'utente ha scelto il numero: " + userNumber + ", numero pari");
		} else {
			userNumber += 1;
			System.out.println("L'utente ha scelto un numero dispari, numero successivo:" + userNumber);
		}
	}
}
