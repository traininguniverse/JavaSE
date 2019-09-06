package com.java.cleaning;

public class Exercise16 {

	public static void main(String[] args) {
		String[] tab = { "moday", "tuesday", "friday" };

		for (int i = 0; i < tab.length; i++)
			System.out.println(tab[i]);

		for (String s : tab)
			System.out.println(s);
	}

}
