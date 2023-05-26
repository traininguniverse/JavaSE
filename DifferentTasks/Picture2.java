package net.traininguniverse.tree;

//Christmas Tree picture in terminal
public class Picture2 {

	public static int k;
	public static int n = 9;
	public static int tab[] = liczba(n);
	public static int krotka;

	public static int[] liczba(int n) {
		int j = 0;
		int tab[] = new int[n];
		for (int i = 1; i <= n; ++i)
			if (i % 2 == 1)
				tab[j++] = i;
		return tab;
	}

	public static void dalej() {
		for (int j = 0; j < (n - (krotka * 2)); ++j)
			System.out.print("*");
		for (int s = 1; s <= krotka; ++s)
			System.out.print(" ");
		k++;
		System.out.println();

	}

	public static void main(String[] args) {

		for (int petla1 = 1; petla1 <= 3; petla1++) {
			if (petla1 == 1) {
				k = 0;
				for (int petla2 = 1; petla2 <= 3; ++petla2) {
					krotka = (n - tab[k]) / 2;
					for (int i = 1; i <= krotka; ++i)
						System.out.print(" ");
					dalej();
				}
			}
			if (petla1 == 2) {
				k = 1;
				for (int petla2 = 1; petla2 <= 3; ++petla2) {
					krotka = (n - tab[k]) / 2;
					for (int i = 1; i <= krotka; ++i)
						System.out.print(" ");
					dalej();
				}
			}
			if (petla1 == 3) {
				k = 2;
				for (int petla2 = 1; petla2 <= 3; ++petla2) {
					krotka = (n - tab[k]) / 2;
					for (int i = 1; i <= krotka; ++i)
						System.out.print(" ");
					dalej();
				}
			}
		}

		for (int i = 0; i <= 1; ++i) {
			for (int j = 0; j <= (n / 2) - 1; ++j) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
}
