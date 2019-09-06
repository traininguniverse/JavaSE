package com.java.cleaning;

public class Exercise21 {

	public static void main(String[] args) {
		for (Banknoty b : Banknoty.values())
			System.out.println(b + ", miejsce: " + b.ordinal());
	}

}
