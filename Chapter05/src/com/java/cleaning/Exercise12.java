package com.java.cleaning;

class Tank {
	String tank = "default";

	void fill() {
		tank = "pełny";
		System.out.println("Napełniono zbiornik");
	}

	void empty() {
		tank = "pusty";
		System.out.println("Opróżniono zbiornik");
	}

	protected void finalize() {
		if (tank == "pełny")
			tank = "pusty";
		System.out.println(tank);
	}
}

public class Exercise12 {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.finalize();
		tank.fill();
		tank.empty();
		tank.finalize();

		tank.fill();
		tank.finalize();

		new Tank();
		System.gc();
	}

}
