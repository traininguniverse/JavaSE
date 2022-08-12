package net.traininguniverse.store.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Basket {

	private Map<Item, Integer> orderedItems = new HashMap<Item, Integer>();

	public Map<Item, Integer> getBasket() {
		return orderedItems;
	}

	public void add(Item item) {
		addItem(item, 1);
	}

	public void addItem(Item item, int quantity) {

		if (quantity < 0)
			throw new IllegalArgumentException("Can't add negative quantity.");
		if (orderedItems.get(item) == null)
			orderedItems.put(item, quantity);
		else
			orderedItems.put(item, orderedItems.get(item) + quantity);
	}

	public void remove(Item item) {
		removeItem(item, 1);
	}

	public void removeItem(Item item, int quantity) {
		if (quantity == 0)
			throw new IllegalArgumentException("Can't remove zero product.");
		if ((orderedItems.get(item) - quantity) < 0)
			throw new IllegalArgumentException("Can't remove from basket more than there is.");
		quantity = orderedItems.get(item) - quantity;
		if (quantity > 0)
			orderedItems.put(item, quantity);
		else if (quantity == 0)
			orderedItems.remove(item);
	}

	public double totalOrderPrice() {
		double sum = 0;
		Set<Entry<Item, Integer>> entrySet = orderedItems.entrySet();
		for (Entry<Item, Integer> entry : entrySet) {
			sum += entry.getValue() * entry.getKey().getPrice();
		}
		return sum;
	}

	public String showBasketContent() {
		StringBuilder content = new StringBuilder();
		Set<Entry<Item, Integer>> entrySet = orderedItems.entrySet();
		for (Entry<Item, Integer> entry : entrySet) {
			content.append(entry.getKey());
			content.append(" , ilość: ");
			content.append(entry.getValue() + ".\n");
		}
		return content.toString();
	}
}
