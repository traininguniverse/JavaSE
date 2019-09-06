package com.java.cleaning;

class Other {
	public static void main(String... args) {
		for (String s : args)
			System.out.print(s + " ");
		System.out.println();
	}
}

public class Exercise20 {

	public static void main(String[] args) {
		Other.main("first");
		Other.main("first", "second");
		Other.main(new String[] { "a", "b", "c" });
		Other.main();
	}

}
