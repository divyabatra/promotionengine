package promotions;

import java.util.List;
import java.util.stream.Collectors;

public class BuyGroupItemsPromotion extends Promotions {

	private char sku1;
	private char sku2;
	private double priceAfterPromotion;

	public BuyGroupItemsPromotion(char sku1, char sku2, double priceAfterPromotion) {
		this.sku1 = sku1;
		this.sku2 = sku2;
		this.priceAfterPromotion = priceAfterPromotion;

	}

	@Override
	boolean isPromotionApplicable() {

		if (cartHasProduct(sku1) && cartHasProduct(sku2)) {
			return true;
		}

		return false;
	}

	private boolean cartHasProduct(char sku) {

		if (CartItem.getCartItemsWithoutPromotion().stream().filter(x -> x.getProduct().getSKU() == sku).toArray().length > 0)
			return true;

		else
			return false;
	}

	@Override
	double applyPromotion() {
		
		for (CartItem cartItem : CartItem.getCartItemsWithoutPromotion()) {
			if(cartItem.getProduct().getSKU() == sku1) cartItem.setPromotionApplied(true);
			break;
		}

		for (CartItem cartItem : CartItem.getCartItemsWithoutPromotion()) {
			if(cartItem.getProduct().getSKU() == sku2) cartItem.setPromotionApplied(true);
			break;
		}
		
		return priceAfterPromotion;
	}

}
