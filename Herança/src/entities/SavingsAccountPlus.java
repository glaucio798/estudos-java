package entities;

public class SavingsAccountPlus extends SavingsAccount {

	@Override
	public final void withdraw(Double amount) {
		this.balance -= amount + 6;
	}
	
}
