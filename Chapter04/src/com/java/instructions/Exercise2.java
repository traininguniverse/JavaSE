package com.java.instructions;

import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {

		Random rand = new Random(47);
		int value;
		int wsk = rand.nextInt(100);
		
		System.out.println("baza: " + wsk);

		for (int i = 0 ; i < 25; ++i) {
			value = rand.nextInt(100);
			
			System.out.println("value: " + value);
			if ( value > wsk)
				System.out.println("value jest wieksza od bazy");
			else if (value < wsk)
				System.out.println("value jest mniejsza od bazy");
			else
				System.out.println("value jest równa bazie");

		}
	}

}
