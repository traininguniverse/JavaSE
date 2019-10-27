import java.util.Scanner;

public class Wiek {
	/*
	 * Jeżeli podamy wiek w sekundach, to jest możliwość obliczenia ile osoba ta ma
	 * lat na ziemi.
	 * 
	 * Kula ziemska przechodzi przez własną orbitę przez 365,25 dnia, które wynosi
	 * równo 31557600 sekund.
	 * 
	 * A więc jeżeli osoba ma 1000000000 sekund to łatwo można policzyć, że
	 * 1000000000/31557600 = 31,69 lat (w przybliżeniu do drugiego miejsca po
	 * przecinku).
	 * 
	 * Teraz rozpatrzmy metodę, która będzie przyjmowała wiek w sekundach oraz
	 * planetę którą chcemy obliczyć.
	 * 
	 * Napisz program, który będzie zawierał tę metodę uwzględniając poniższe dane
	 * dotyczące innych planet:
	 * 
	 * Obrót Merkurego podczas własnej orbity wynosi 0.2408467 lat ziemskich Obrót
	 * Wenus podczas własnej orbity wynosi 0.61519726 lat ziemskich Obrót Marsa
	 * podczas własnej orbity wynosi 1.8808158 lat ziemskich Obrót Jowisza podczas
	 * własnej orbity wynosi 11.862615 lat ziemskich Obrót Saturna podczas własnej
	 * orbity wynosi 29.447498 lat ziemskich Obrót Uranu podczas własnej orbity
	 * wynosi 84.016846 lat ziemskich Obrót Neptuna podczas własnej orbity wynosi
	 * 164.79132 lat ziemskich
	 */

	public static void main(String[] args) {

		String number, planeta;
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj wiek w sekundach i planete");
		number = input.nextLine();
		planeta = input.nextLine();

		double numberI = Double.parseDouble(number);

		double wiek = numberI / 31557600;

		switch (planeta) {
		case "Ziemia":
			wiek = numberI / 31557600;
			System.out.format("%.2f%n", wiek);
			break;
		case "Merkury":
			wiek = numberI / (31557600 * 0.2408467);
			System.out.format("%.2f%n", wiek);
			break;
		case "Mars":
			wiek = numberI / (31557600 * 1.8808158);
			System.out.format("%.2f%n", wiek);
			break;
		case "Jowisz":
			wiek = numberI / (31557600 * 11.862615);
			System.out.format("%.2f%n", wiek);
			break;
		case "Saturn":
			wiek = numberI / (31557600 * 29.447498);
			System.out.format("%.2f%n", wiek);
			break;
		case "Uran":
			wiek = numberI / (31557600 * 84.016846);
			System.out.format("%.2f%n", wiek);
			break;
		case "Neptun":
			wiek = numberI / (31557600 * 164.79132);
			System.out.format("%.2f%n", wiek);
			break;
		default:
			System.out.println("Podaj wiek w sekundach i planete");
		}

		input.close();

	}

}
