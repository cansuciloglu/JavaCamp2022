package classesWithAttributes;

public class Product {

	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private double stockAmount;
	private String code;

	public Product() {

	}

	public Product(int id, String name, String description, double price, double stockAmount) {
		System.out.println("Constructor block worked");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(double stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getCode() {
		return this.name.substring(0, 1) + id;
	}

}
