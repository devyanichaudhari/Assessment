package com.edubridge.assessment.inheritance;

public class Executor {

	public static void main(String[] args) {
		SavingAccounts s1 = new SavingAccounts("29373",99);
		s1.deposit(20);
		s1.withdraw(10);
		System.out.println(s1.getBalance());
		
	}

}
