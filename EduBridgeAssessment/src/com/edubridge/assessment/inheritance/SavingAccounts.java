package com.edubridge.assessment.inheritance;

public class SavingAccounts extends BankAccount{

	public SavingAccounts(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amount) {
        if (getBalance() - amount < 100) 
        {
            System.out.println("Minimum balance of 100 required!");
        } 
        else 
        {
            super.withdraw(amount);
        }
	}
}
