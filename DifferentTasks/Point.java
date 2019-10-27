import java.util.Scanner;

class Point {

	/*
	 * Zaimplementuj niemodyfikowalną klasę Point opisującą punkt na płaszczyźnie.
	 * Dołącz konstruktor ustawiający ją na konkretny punkt, konstruktor bez
	 * argumentów ustawiający ją na punkt odniesienia oraz metody: getX, getY,
	 * translate, scale oraz show.
	 * 
	 * Metoda translate przesuwa punkt o podaną w zmiennych odległość w kierunku
	 * współrzędnych x i y.
	 * 
	 * Metoda scale skaluje obie współrzędne o podany współczynnik.
	 * 
	 * Metoda show wypisuje na ekran współrzędne punktu w następujący sposób:
	 * 
	 * 2.5 4.5// Najpierw x potem y
	 * 
	 * Zaimplementuj te metody w taki sposób, by w wyniku działania zwracały punkty.
	 * 
	 * Napisz metodę main, która będzie ręcznie sprawdzać działania powyższych metod
	 * (głównie metody show). Metoda main powinna jako argument pobierać punkt a
	 * następnie opcję (liczba naturalna) oznaczająca wywołanie konkretnej metody, a
	 * mianowicie:
	 * 
	 * 0 - wywołanie metody translate, a potem show 1 - wywołanie metody scale, a
	 * potem show 2 - wywołanie translate, potem scale a potem show 3 - wywowłanie
	 * scale, potem translate, a potem show 4 - wywołanie tylko show
	 * 
	 * Należy pamiętać o pobieranie odpowiedniego argumentu podczas wywoływanej
	 * opcji.
	 * 
	 * Nie przewidujemy sytuacji wyjątkowych.
	 */

	double x = 0;
	double y = 0;

	Point() {
		this.x = 0;
		this.y = 0;
	}

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double getX() {
		return this.x;
	}

	double getY() {
		return this.y;
	}

	void translate(double x, double y) {

		this.x += x;
		this.y += y;
	}

	void scale(double wsp) {
		this.x *= wsp;
		this.y *= wsp;
	}

	void show() {
		System.out.println(getX() + " " + getY());
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj wspolrzedne");
		String wsp = input.nextLine();
		System.out.println("Wybor z menu");
		int wybor = Integer.parseInt(input.nextLine());
		String tab[] = wsp.split(" ");
		double zmX = Double.parseDouble(tab[0]);
		double zmY = Double.parseDouble(tab[1]);
		Point point = new Point(zmX, zmY);

		switch (wybor) {
		case 0:
			System.out.println("Podaj wspolrzedne translacji");
			String trans[] = input.nextLine().split(" ");
			point.translate(Double.parseDouble(trans[0]), Double.parseDouble(trans[1]));
			point.show();
			break;
		case 1:
			System.out.println("Podaj wspolrzedna do skalowania");
			double scale = input.nextDouble();
			point.scale(scale);
			point.show();
			break;
		case 2:
			System.out.println("Podaj wspolrzedne translacji");
			String trans2[] = input.nextLine().split(" ");
			point.translate(Double.parseDouble(trans2[0]), Double.parseDouble(trans2[1]));
			System.out.println("Podaj wspolrzedna do skalowania");
			double scale2 = input.nextDouble();
			point.scale(scale2);
			point.show();
			break;
		case 3:
			System.out.println("Podaj wspolrzedna do skalowania");
			double scale3 = input.nextDouble();
			input.nextLine();
			point.scale(scale3);
			System.out.println("Podaj wspolrzedne translacji");
			String trans3[] = input.nextLine().split(" ");
			point.translate(Double.parseDouble(trans3[0]), Double.parseDouble(trans3[1]));
			point.show();
			break;
		case 4:
			point.show();
			break;
		default:
			System.out.println("X Y \n opcja");
		}

	}
}