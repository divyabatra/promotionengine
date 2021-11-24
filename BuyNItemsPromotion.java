package promotions;

import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BuyNItemsPromotion extends Promotions {

	private int quantity;
	private char sku;
	private double priceAfterPromotion;

	public BuyNItemsPromotion(char sku, int quantity, double priceAfterPromotion) {
		this.quantity = quantity;
		this.sku = sku;
		this.priceAfterPromotion = priceAfterPromotion;
	}

	@Override
	boolean isPromotionApplicable() {

		for (CartItem cartItem : CartItem.getCartItemsWithoutPromotion()) {

			if (cartItem.getProduct().getSKU() == sku && cartItem.getQuantity() >= quantity) {
				return true;
			}
		}

		return false;
	}

	@Override
	double applyPromotion() {
		int quantityOfProductsForPromotion = quantity;
		for (CartItem cartItem : CartItem.getCartItemsWithoutPromotion().stream().filter(x -> x.getProduct().getSKU() == sku)
				.collect(Collectors.toList())) {
			cartItem.setPromotionApplied(true);
			quantityOfProductsForPromotion--;
			//quantityOfProductsForPromotion = quantityOfProductsForPromotion - quantity;
			if (quantityOfProductsForPromotion == 0)
				break;

		}

		return priceAfterPromotion;
	}

}
