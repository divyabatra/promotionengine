package promotions;

import java.util.*;

public class PromotionEngine {
	
	static List<Promotions> livePromotions = new ArrayList<Promotions>();
	
	public static List<Promotions> getLivePromotions(){
		return livePromotions;
	}

	public static void addPromotion(Promotions promotion) {
		
		livePromotions.add(promotion);
	}
	
	public static void init()
	{
		addPromotion(new BuyNItemsPromotion('A', 3, 130));
		addPromotion(new BuyNItemsPromotion('B', 2, 45));
		addPromotion(new BuyGroupItemsPromotion('A', 'B', 65));
		addPromotion(new BuyGroupItemsPromotion('C', 'D', 30));
	}
	

}
