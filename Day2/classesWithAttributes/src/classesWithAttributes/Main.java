package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// Product product = new Product(1 , "Laptop" , "Monster Abra" , 15000 , 2 );
		Product product = new Product();
		product.setName("Laptop"); 
		product.setId(1);
		product.setDescription("Monster Abra");
		product.setPrice(15000);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getCode());

	}

}
