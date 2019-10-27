import java.util.Scanner;

class Armstrong {

	public static void main(String[] args) {

		// 153,9,10
		// Liczba Armstronga to taka liczba, która jest sumą potęg cyfr służących do jej
		// zapisu

		String number;
		Scanner input = new Scanner(System.in);
		number = input.nextLine();

		int suma = 0;

		String tab[] = number.split("");

		for (int i = 0; i < number.length(); ++i) {
			suma += Math.pow(Integer.parseInt(tab[i]), number.length());
		}

		if (suma == Integer.parseInt(number)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		input.close();

	}

}
