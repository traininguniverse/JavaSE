package net.traininguniverse.konwersja.main;

public class Box<T> {
	private final T attribute;

	public Box(T attribute) {
		this.attribute = attribute;
	}

	public T getAttribute() {
		return attribute;
	}
}