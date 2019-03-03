package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new BusinessAccount(1002, "Ana", 1000.00, 500.00);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new SavingsAccount(1003, "Bob", 1000.0, 0.01);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

		
	}

}
