package com.java.cleaning;

/*Wykorzystanie finalize() do wykrywania obiektu, który nie został odpowiednio "sprzątnięty". */

class Book {
	boolean checkedOut = false;

	Book(boolean checkOut) {
		checkedOut = checkOut;
	}

	void checkIn() {
		checkedOut = false;
	}

	protected void finalize() {
		if (checkedOut)
			System.out.println("Błąd:  w obiegu");
		/*
		 * Normalnie powinno się użyć również tego: super.finalize(); // Wywołanie
		 * wersji z klasy bazowej
		 */
	}
}

public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn(); // Właściwe "sprzątanie"
		new Book(true); // Zarzucenie referencji, przeoczenie sprzątania
		System.gc(); // Wymuszenie odśmiecania pamięci i finalizacji
	}
}
// Output: Błąd: w obiegu