package oop1;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("Delonghi Coffee Machine");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setImageUrl("x.jpg");
		product1.setUnitsInStock(8);
		
		Product product2 = new Product();
		product2.setName("Smeg Coffee Machine");
		product2.setUnitPrice(8500);
		product2.setDiscount(8);
		product2.setImageUrl("y.jpg");
		product2.setUnitsInStock(9);
		
		Product product3 = new Product();
		product3.setName("Delonghi Coffee Machine");
		product3.setUnitPrice(7000);
		product3.setDiscount(9);
		product3.setImageUrl("z.jpg");
		product3.setUnitsInStock(10);
	
		
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("5433333333");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Cansu");
		individualCustomer.setLastName("Çiloğlu");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("54444444444");
		corporateCustomer.setCustomerNumber("123456");
		corporateCustomer.setTaxNumber("11111111");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		
	}

}
