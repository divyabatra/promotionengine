package promotions;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Promotions {

	abstract boolean isPromotionApplicable();

	abstract double applyPromotion();

}
