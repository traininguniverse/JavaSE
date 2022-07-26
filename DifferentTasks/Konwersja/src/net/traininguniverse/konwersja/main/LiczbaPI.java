package net.traininguniverse.konwersja.main;

import java.util.Scanner;

public class LiczbaPI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbę do pomnożenia: ");
		int liczba = scanner.nextInt();
		System.out.println("Mnożenie całkowite: " + (int)(liczba * Math.PI));
		System.out.println("Mnożenie zmiennoprzecinkowe: " + (double)(liczba * Math.PI));

	}

}
