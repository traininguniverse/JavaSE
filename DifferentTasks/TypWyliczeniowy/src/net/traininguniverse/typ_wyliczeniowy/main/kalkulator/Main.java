package net.traininguniverse.typ_wyliczeniowy.main.kalkulator;

public class Main {

	public static void main(String[] args) {

		System.out.println("2*3= " + Computation.MULTIPY.perform(2, 3));
		System.out.println("30/3=" + Computation.DIVIDE.perform(30, 3));
		System.out.println("17+3=" + Computation.ADD.perform(17, 3));
		System.out.println("17-3=" + Computation.SUBTRACT.perform(17, 3));
	}

}
