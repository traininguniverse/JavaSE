package com.java.instructions;

//Ciąg Fibonacciego

public class Fibonacci {

	public static void main(String[] args) {

		int k = 10; // liczba żądanych elementów ciągu
		int s = 0;
		int p = 0, n = 0;

		for (int i = 1; i <= k; ++i) {
			if (i == 1) {
				System.out.print(1 + " ");
				p = 1;
				continue;
			}
			if (i == 2) {
				System.out.print(1 + " ");
				n = 1;
				continue;
			}
			if (i > 2) {
				s = p + n;
				System.out.print(s + " ");
				p = n;
				n = s;
			}
		}
	}

}
