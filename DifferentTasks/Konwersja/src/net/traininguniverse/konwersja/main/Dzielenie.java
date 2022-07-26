package net.traininguniverse.konwersja.main;

import java.util.Scanner;

public class Dzielenie {

	Scanner scanner = new Scanner(System.in);

	int pobierzLiczbe() {
		System.out.println("Podaj liczbę: ");
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		Dzielenie dzielenie = new Dzielenie();
		double iloraz = 0;
		int dzielna = dzielenie.pobierzLiczbe();
		int dzielnik = dzielenie.pobierzLiczbe();
		iloraz = (double) dzielna / dzielnik;
		System.out.println("Wynik dzielenia liczb, to : " + iloraz);
	}

}
