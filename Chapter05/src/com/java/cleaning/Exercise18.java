package com.java.cleaning;

class Example2 {
	Example2(String s) {
		System.out.println(s);
	}
}

public class Exercise18 {

	public static void main(String[] args) {

		Example2[] examTab = new Example2[3];

		for (int i = 0; i < 3; ++i) {
			examTab[i] = new Example2(Integer.toString(i));
		}
	}

}
