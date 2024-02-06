package com.edubridge.assessment.inheritance;

public class BankAccount 
{
	private String accountNumber;
    private double balance;
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	public double getBalance()
	{
		return balance;
	}
}
