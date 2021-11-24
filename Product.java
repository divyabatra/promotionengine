package promotions;

public class Product {

	private char SKU;
	private double price;
	
	Product(char sku, double price)
	{
		this.price = price;
		this.SKU = sku;
	}
	
	public char getSKU() {
		return SKU;
	}
	public void setSKU(char sku) {
		SKU = sku;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
