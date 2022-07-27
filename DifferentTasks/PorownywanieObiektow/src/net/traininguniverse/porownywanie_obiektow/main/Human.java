package net.traininguniverse.porownywanie_obiektow.main;

public class Human {

	private String name;
	private String surname;
	private String pesel;

	public Human(String name, String surname, String pesel) {
		super();
		this.name = name;
		this.surname = surname;
		this.pesel = pesel;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPesel() {
		return pesel;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human otherHuman = (Human) obj;
			return name.equals(otherHuman.getName()) && surname.equals(otherHuman.getSurname())
					&& pesel.equals(otherHuman.getPesel());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 13 * name.hashCode() + 7 * surname.hashCode() + 11 * pesel.hashCode();
	}
}
