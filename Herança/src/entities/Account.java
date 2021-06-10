package entities;

/*
Coloca abstract depois to public para a Classe Account ser abstrata, ou seja, não pode ser instanciada, apenas utilizada por outras subclasses. 
Podemos ainda declarar o tipo account, so não podemos instanciar, com o new, por exemplo.

*/

public class Account {
	private int number;
	private String holder;
	protected double balance;

	public Account() {
	}

	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(Double amount) {
		this.balance -= (amount + 5.0);
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

}
