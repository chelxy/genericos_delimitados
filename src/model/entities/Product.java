package model.entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPprice() {
		return price;
	}

	public void setPprice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return name
				+ ", "
				+ String.format("%.2f", price);
	}

}
