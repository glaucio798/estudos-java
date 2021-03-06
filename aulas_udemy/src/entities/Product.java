package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

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
