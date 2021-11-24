package promotions;

import java.util.ArrayList;
import java.util.List;

public class App {

	static List<CartItem> cart;

	public static void main(String args[]) {

		initCart();

	}

	private static void initCart() {
		cart = new ArrayList<CartItem>();
	}
}
