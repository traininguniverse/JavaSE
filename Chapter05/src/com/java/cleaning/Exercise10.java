package com.java.cleaning;

class Wypisz {
	protected void finalize() {
		System.out.println("Wywołana metoda finalize()");
	}
}

public class Exercise10 {

	public static void main(String[] args) {

		new Wypisz();

		// Exercise11:
		// System.gc();
	}

}
