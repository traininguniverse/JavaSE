package com.java.cleaning;

public class Exercise22 {

	static void describe(Banknoty opis) {
		switch (opis) {
		case BANKNOT1:
		case BANKNOT2:
			System.out.println("Jeden z minejszych nominałów");
			break;
		case BANKNOT3:
		case BANKNOT4:
			System.out.println("Jeden z średnich nominałów");
			break;
		case BANKNOT5:
		case BANKNOT6:
		default:
			System.out.println("Jeden z większych nominałów");
		}
	}

	public static void main(String[] args) {
		describe(Banknoty.BANKNOT1);
		describe(Banknoty.BANKNOT4);
		describe(Banknoty.BANKNOT6);
	}

}
