package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.price = price;
		this.quantity = quantity;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}
	
	public double valueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity){
		this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return String.format(name + " - " + price + " - " + quantity + " - " + this.valueInStock() + "\n");
	}
	
}
