package net.traininguniverse.wyjatki.main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * Obliczanie pierwiastka z podanej liczby przy pomocy obsługi wyjątków.
 *
 */

public class Wyjatki {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		double number = 0;
		System.out.println("Podaj liczbę żeby obliczyć z niej pierwiastek.");

		while (true) {
			try {
				number = scanner.nextDouble();
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Podaj poprawną liczbę. ");
				scanner.next();
			}
		}
		if (number < 0) {
			throw new IllegalArgumentException(String.format("Podaj dodatnią liczbę, podano: %.4f", number));
		}

		System.out.println("Pierwiastek z liczby to: " + Math.sqrt(number));
	}

}
