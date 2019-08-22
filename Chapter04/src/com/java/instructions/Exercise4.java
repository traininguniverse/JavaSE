package com.java.instructions;

/*
Napisz program, który użyje dwóch zagnieżdżonych pętli for 
i operatora modulo (%) do wykrywania i wypisywania kolejnych
liczb pierwszych (liczb całkowitych, które dzielą się bez reszty 
jedynie przez 1 i przez siebie same).
*/

public class Exercise4 {

	public static void main(String[] args) {

		boolean breakMe;
		int max;
		boolean checked = true;
		for (int i = 1; i <= 100; ++i) {
			if (checked == false) {
				System.out.println(--i);
				i++;
			}
			checked = false;
			breakMe = false;
			max = i;
			for (int j = 1; j <= max; ++j) {
				if (breakMe == false) {
					if ((i % j == 0) && (i != j) && (j != 1)) {
						checked = true;
						breakMe = true;
					} else if ((i != j) && (j != 1)) {
						checked = false;
					}
				}
			}
		}

	}

}
