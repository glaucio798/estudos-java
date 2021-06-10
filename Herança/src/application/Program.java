package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(101, "Joao", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		//UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// erro BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(400.0);
			System.out.println("Loan");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		Account acc6 = new Account(1005, "Jorge", 1000.0);
		acc6.withdraw(200.0);
		System.out.println("Saldo acc6 " + acc6.getBalance());
		
		SavingsAccount acc7 = new SavingsAccount(1006, "Jonathan", 1000.0, 0.05);
		acc7.withdraw(200.0);
		System.out.println("Saldo acc7 " + acc7.getBalance());
		
		BusinessAccount acc8 = new BusinessAccount(1007, "Mary", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println("Saldo acc8 " + acc8.getBalance());

		
		// Polimorfismo
		
		Account x = new Account(1008, "Alex", 1000.0);
		Account y = new SavingsAccount(1009, "Ale", 1000.0, 0.1);

		x.withdraw(50.0);
		y.withdraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
	}

}
