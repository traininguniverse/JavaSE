package net.traininguniverse.konwersja.main;

public class Zamiana {

	public static void main(String[] args) {

		int liczba = 0;
		char znak = 'p';
		System.out.println("Wynik przypisania: " + (liczba = znak));

		liczba = 113;

		System.out.println("Przypisanie odwrotne: " + (znak = (char) liczba));
	}

}
