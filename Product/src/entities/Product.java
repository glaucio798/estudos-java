package entities;

public class Product {

	String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double TotalValueInStock() {
		return this.quantity * this.price;
	}

	public void AddProducts(int qnt) {
		this.quantity += qnt;
	}

	public void RemoveProducts(int qnt) {
		this.quantity -= qnt;
	}

	public String toString() {
		return "Dados: "+ name +", $ "+ String.format("%.2f", price) +", "+ quantity +" unidades, Valor total: "+
			String.format("%.2f",TotalValueInStock());
	}
}
