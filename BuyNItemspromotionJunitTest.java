package junit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import promotions.App;
import promotions.BuyNItemsPromotion;

class BuyNItemspromotionJunitTest {
	
	

	@Test
	void buyNItemsPromotionApplicabletest_ForOneItem() {
		// Arrange
		App.init();
		
		// Act
		BuyNItemsPromotion items = new BuyNItemsPromotion('A', 3, 130);
		
		// Assert
		assertEquals(true, items.isPromotionApplicable());
	}
	
	
	

}
