package net.traininguniverse.store.main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {

	private Basket basket;
	private final Item item1 = new Item("Laptop", 2000.0);
	private final Item item2 = new Item("Monitor", 700.0);
	private final Item item3 = new Item("Klawiatura", 50.0);

	@Before
	public void prepareBasket() {
		basket = new Basket();
		basket.addItem(item1, 3);
		basket.addItem(item2, 5);
		basket.addItem(item3, 10);
	}

	@Test
	public void checkRemoveAllProduct() {
		basket.removeItem(item3, 10);
		assertFalse(basket.getBasket().containsKey(item3));
	}

	@Test
	public void checkAllAmount() {
		assertTrue(basket.totalOrderPrice() == 10000.0);
	}

	// powinno być porównanie ze stringiem
	@Test
	public void showBasket() {
		System.out.println(basket.showBasketContent());
	}

	@Test
	public void checkQuantityOfAddedProduct() {
		basket.addItem(item2, 2);
		assertTrue(basket.getBasket().get(item2) == 7);
	}

	@Test
	public void checkQuantityOfRemovedProduct() {
		basket.removeItem(item3, 5);
		assertTrue(basket.getBasket().get(item3) == 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrownIllegalArgumentExceptionOnWrongParameters() {
		basket.addItem(item1, -2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrownIllegalArgumentExceptionOnWrongParameters2() {
		basket.removeItem(item3, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrownIllegalArgumentExceptionOnWrongParameters3() {
		basket.removeItem(item1, 30);
	}

}
