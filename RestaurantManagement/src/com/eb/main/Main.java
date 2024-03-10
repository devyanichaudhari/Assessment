package com.eb.main;

import java.util.Scanner;

import com.eb.pojo.Customer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Welcome to Product Management Portal "+name);
		int ch = 0;
		do
		{
			System.out.println("Press 1 for Customer Manangement System.");
			System.out.println("Press 2 for Menu Management System.");
			System.out.println("Press 3 for Order Management System");
			System.out.println("Press 4 for Employee Management System.");
			System.out.println("Press 5 to Exit");
			System.out.println("Please Enter your Choice:");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				int choice =0;
				choice = sc.nextInt();
				do
				{
					System.out.println("Press 1 to Add Customer Details.");
					System.out.println("Press 2 to Update Customer Details.");
					System.out.println("Press 3 to Delete Customer Detail.");
					System.out.println("Press 4 to Display Customer Details.");
					System.out.println("Press 5 to Exit");
					System.out.println("Please Enter your Choice:");
					ch = sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter the Customer Name: ");
						String cus_name = sc.next();
						System.out.println("Enter the Customer Contact: ");
						String cus_con = sc.next();
						System.out.println("Enter the Customer Address: ");
						String cus_add = sc.next();
						Customer c = new Customer(cus_name,cus_con,cus_add);
						//Method Call Pending
						System.out.println("Data Inserted Successfully");
					break;	
					}	
				}
				while(choice!=5);
						
			}
		}
		while(ch!=5);
	}
	
}
