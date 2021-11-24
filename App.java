package promotions;

import java.util.ArrayList;
import java.util.List;

public class App {

	static List<CartItem> cart;

	public static void main(String args[]) {

		init();
		
		System.out.println(PriceEngine.calculatePrice());
	}

	private static void init() {
		cart = new ArrayList<CartItem>();
		PromotionEngine.init();
		Inventory.init();
		
		cart.add(new CartItem(Inventory.getProductBySKU('A'), 3));
		cart.add(new CartItem(Inventory.getProductBySKU('B'), 2));
	}
}
