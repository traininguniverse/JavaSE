package net.traininguniverse.porownywanie_obiektow.main;

public class Zmiennoprzecinkowe {

	public static void main(String[] args) {

		System.out.println("0.3 == 0.1 + 0.2: " + (0.3 == 0.1 + 0.2)); // !!! false
		System.out.println("0.3 == 0.1 + 0.2: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.000001)); // true
		//Math.abs() - wartość bezwzględna z liczby

	}

}
