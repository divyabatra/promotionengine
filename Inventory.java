package promotions;

import java.util.*;

public class Inventory {
	
	static List<Product> productList;
	
	public static void init()
	{
		productList = new ArrayList<Product>();
		productList.add(new Product('A',50));
		productList.add(new Product('B',30));
		productList.add(new Product('C',20));
		productList.add(new Product('D',15));
		
	}
	
	public static Product getProductBySKU(char sku)
	{
		for (Product product : productList) {
			if(product.getSKU() == sku)
				return product;
		}
		return null;
		
	}

}


