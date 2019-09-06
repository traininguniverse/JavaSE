package com.java.cleaning;

class Extra {
	public static void main(String[] args) {
		for (String s : args)
			System.out.println(s);
	}
}

public class DynamicArray {

	public static void main(String[] args) {
		String[] tab = { "first", "second", "third" };
		Extra.main(tab);
		Extra.main(new String[] { "fourth", "fifth", "sixth" });
	}

}
