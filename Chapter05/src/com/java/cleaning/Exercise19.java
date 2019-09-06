package com.java.cleaning;

public class Exercise19 {

	static void f(String... s) {

		for (String i : s)
			System.out.println(i);
	}

	public static void main(String[] args) {

		f("first", "second", "third");
		f(new String[] { "fourth", "fifth" });
		// f("first", "second", "third", new String[]{"fourth", "fifth"}); //nie można
		// przekazać równocześnie
	}

}
