package com.java.operators;

//Przypisywanie obiektów

class Tank {
	int level;
}

public class Assignment {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();

		t1.level = 9;
		t2.level = 27;

		System.out.println("t1:" + t1.level + "\nt2:" + t2.level);
		// 9,27

		t1 = t2;

		System.out.println("t1:" + t1.level + "\nt2:" + t2.level);
		// 27,27

		t1.level = 100;
		System.out.println("t1:" + t1.level + "\nt2:" + t2.level);
		// 100,100
	}

}
