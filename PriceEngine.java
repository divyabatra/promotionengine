package promotions;

import java.util.Iterator;

public class PriceEngine {

	public static double calculatePrice() {
		double cartPrice= 0;
		
		for (Promotions promotion : PromotionEngine.getLivePromotions()) {
			while(promotion.isPromotionApplicable()) {
				cartPrice += promotion.applyPromotion();	
			}
		}
		
		// add price of products which did not have any promotions applicable
		for (CartItem cartItem: CartItem.getCartItemsWithoutPromotion()) {
			cartPrice+=cartItem.getProduct().getPrice();	
		}
		
		return cartPrice;
	}
}
