package builder;

import java.util.ArrayList;
import java.util.List;

public class Device {
	
	private List<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product) {
		
		products.add(product);
	}
	
	public int getCost() {
		
		int cost = 0;
		
		for(Product product : products) {
			
			cost += product.price();
		}
		
		return cost;	
	}
	
	public void showProducts() {
		
		for(Product product : products) {
			
			System.out.print("Product : " +product.name());
			System.out.print(", Housing : " +product.housing());
			System.out.println(", Price : " +product.price());
		}
	}

}
