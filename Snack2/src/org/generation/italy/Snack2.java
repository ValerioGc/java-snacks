package org.generation.italy;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] randNames = {"Luca", "Alessio", "Simone", "Valerio", "Mario"};
		String[] randSurnames = {"Rossi", "Bianchi", "Verdi", "Proietti", "cognome"};
		Random rnd = new Random();
		int numberC = rnd.nextInt(5);		
		int numberC2 = rnd.nextInt(5);
			System.out.println("Nome invitato: " + randNames[numberC] + " " + randSurnames[numberC2]);
		
		
	}
}
