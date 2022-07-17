package net.traininguniverse.srednia_ocen;

/**
 * 
 * Program wyliczający średnią ocen z kilku przediotów w szkole.
 *
 */

public class Main {

	public float obliczSrednia(int[][] uczen) {

		float suma = 0;

		for (int i = 0; i < uczen.length; ++i)
			for (int j = 0; j < uczen[i].length; ++j) {
				suma += uczen[i][j];
			}
		return suma / (uczen.length * uczen[uczen.length - 1].length);
	}

	public static void main(String[] args) {

		int numberOfClasses = 3; // liczba przedmiotów
		int numberOfNotes = 4; // liczba ocen z danego przedmiotu
		int[][] Pawel = new int[numberOfClasses][numberOfNotes];

		Pawel[0] = new int[] { 2, 2, 2, 2 };
		Pawel[1] = new int[] { 3, 3, 3, 3 };
		Pawel[2] = new int[] { 5, 5, 5, 5 };

		Main main = new Main();
		System.out.println(main.obliczSrednia(Pawel));

	}
}
