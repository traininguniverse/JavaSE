package net.traininguniverse.porownywanie_obiektow.main;

public class Main {

	public static void main(String[] args) {

		Human human1 = new Human("Jan", "Kowalski", "12345678912");
		Human human2 = new Human("Jan", "Kowalski", "12345678911");
		Human human3 = new Human("Piotr", "Kowalski", "12345678912");
		Human human4 = new Human("Jan", "Kowalski", "12345678912");

		System.out.println("human1.equals(human2): " + human1.equals(human2));
		System.out.println("human1.equals(human3): " + human1.equals(human3));
		System.out.println("human1.equals(human4): " + human1.equals(human4));
		System.out.println("human1.equals(null): " + human1.equals(null));
	}

}
