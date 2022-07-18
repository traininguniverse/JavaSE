package net.traininguniverse.obliczenia;

import java.util.Scanner;

/**
 * 
 * Implementacja dodawania i mnożenia z użyciem interfejsów.
 *
 */

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		Computation computation;

		if (main.shouldMultiply(scanner)) {
			computation = new Multiplication();
		} else {
			computation = new Addition();
		}

		double argument1 = main.getArgument(scanner);
		double argument2 = main.getArgument(scanner);

		double result = computation.compute(argument1, argument2);
		System.out.println("Wynik: " + result);
		scanner.close();
	}

	// wybór rodzaju obliczeń
	private boolean shouldMultiply(Scanner scanner) {
		do {
			System.out.println("Podaj co chcesz robić:");
			System.out.println("1 - Mnożenie");
			System.out.println("2 - Dodawanie");
			int decision = scanner.nextInt();
			switch (decision) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				System.out.println("Podaj 1 lub 2");
			}
		} while (true);
	}

	// pobranie argumentów
	private double getArgument(Scanner scanner) {
		System.out.println("Podaj liczbę:");
		double arg = scanner.nextDouble();
		return arg;

	}
}
