package org.generation.italy;
//creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine
//creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine inverso
//trovare e stampare la parola piu' lunga e la sua lunghezza
//trovare e stampare la parola piu' corta e la sua lunghezza


public class Snack7 {
	public static void main(String[] args) {
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		String totalWords = "";
		String totalRevWords = "";
		String shortW = "        ";
		String lngW = "";
		
		for (int i = 0; i < words.length;i++) {
			String pointerArr = words[i];
			totalWords += pointerArr + " ";
			
			if (shortW.length() > pointerArr.length()) {
				shortW = pointerArr.toLowerCase();
			}			
			if (lngW.length() < pointerArr.length()) {
				lngW = pointerArr;
			} 
			
		}
		
		int x = words.length;
		while (x > 0) {
			String pointerArr = words[x - 1];
			totalRevWords += pointerArr.toLowerCase() + " ";
			x--;
		}

		System.out.println("Concatenazione stringhe: " + totalWords);		
		System.out.println("Concatenazione inversa: " + totalRevWords);
		System.out.println("Parola più corta: " + shortW + ", lunghezza: " + shortW.length()+ " caratteri");
		System.out.println("Parola più lunga: " + lngW + ", lunghezza: " + lngW.length() + " caratteri");
		

	}
}
