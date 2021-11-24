package promotions;

import java.util.List;
import java.util.stream.Collectors;

public class CartItem {
	
	
	CartItem(Product product,int quantity)
	{
		this.product = product;
		this.quantity = quantity;
		this.isPromotionApplied = false;
		
	}

	private Product product;
	private int quantity;
	boolean isPromotionApplied;
	
	public boolean isPromotionApplied() {
		return isPromotionApplied;
	}
	public void setPromotionApplied(boolean isPromotionApplied) {
		this.isPromotionApplied = isPromotionApplied;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public static List<CartItem> getCartItemsWithoutPromotion() {
		return App.cart.stream().filter(x -> x.isPromotionApplied == false).collect(Collectors.toList());
	}
	
	
}
