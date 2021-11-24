package promotions;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Promotions {

	protected List<CartItem> getCartItemsWithoutPromotion() {
		return App.cart.stream().filter(x -> x.isPromotionApplied == false).collect(Collectors.toList());
	}

	abstract boolean isPromotionApplicable();

	abstract double applyPromotion();

}
