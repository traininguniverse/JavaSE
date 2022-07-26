package net.traininguniverse.konwersja.main;

public class UnboxingExceptions {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Box<?> box = new Box<>(new Object());
		Box<Integer> box2 = (Box<Integer>) box;
		int attribute = box2.getAttribute();
		
		//Exception in thread "main" java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap
	}
}