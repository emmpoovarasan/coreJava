package com.tutorialspoint.exceptions;

public class BankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("Checking Account number is : "+c.getNumber());
		System.out.println("Depositing $500...");
		c.deposit(500);
		System.out.println("Current Balanace is : $"+c.getBalance());
		try {
			System.out.println("\nWithdrawing $100...");
			c.withdraw(100.00);
			System.out.println("Current Balanace is : $"+c.getBalance());
			System.out.println("\nWithdrawing $600...");
			c.withdraw(600.00);
			System.out.println("Current Balanace is : $"+c.getBalance());
			
		} catch (InsufficientFundsException e) {
			// TODO: handle exception
			System.out.println("Sorry, but you are short $"+e.getAmount());
			
			e.printStackTrace();
		}
	}

}
