package com.eb.main;

import java.util.Scanner;

import com.eb.dao.CustomerDao;
import com.eb.dao.EmployeeDao;
import com.eb.dao.MenuDao;
import com.eb.dao.OrderDao;
import com.eb.pojo.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Orders o = new Orders();
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Welcome to Restaurant Management Portal "+name);
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
				do
				{
					System.out.println("Press 1 to Add Customer Details.");
					System.out.println("Press 2 to Update Customer Details.");
					System.out.println("Press 3 to Delete Customer Detail.");
					System.out.println("Press 4 to Display Customer Details.");
					System.out.println("Press 5 to Exit");
					System.out.println("Please Enter your Choice:");
					choice = sc.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("Enter the Customer Name: ");
						String cus_name = sc.next();
						System.out.println("Enter the Customer Contact: ");
						String cus_con = sc.next();
						System.out.println("Enter the Customer Address: ");
						String cus_add = sc.next();
						Customer c = new Customer(cus_name,cus_con,cus_add);
						boolean ans = CustomerDao.insert(c);
						
						System.out.println("Data Inserted Successfully");	
					break;	
					case 2:
						CustomerDao.update();
						System.out.println("Data Updated Successfully");
					break;
					case 3:
						System.out.println("Enter which ID you want to Delete");
						int cus_id = sc.nextInt();
						CustomerDao.delete(cus_id);
						System.out.println("Data Deleted Successfully");
					break;
					case 4:
						CustomerDao.display();
					break;
					case 5:
						System.out.println("Bye Bye :)");
					break;
					default:
						System.out.println("You have Entered Wrong Choice");
					}	
			
				}
				while(choice!=5);
			break;
			case 2:
				int choice1 =0;
				//choice = sc.nextInt();
				do
				{
					System.out.println("Press 1 to Add Menu Details.");
					System.out.println("Press 2 to Update Menu Details.");
					System.out.println("Press 3 to Delete Menu Detail.");
					System.out.println("Press 4 to Display Menu Details.");
					System.out.println("Press 5 to Exit");
					System.out.println("Please Enter your Choice:");
					choice1 = sc.nextInt();
					switch(choice1)
					{
					case 1:
						System.out.println("Enter the Menu Name: ");
						String menu_name = sc.next();
						System.out.println("Enter the Menu Price: ");
						int menu_price = sc.nextInt();
						System.out.println("Enter the Menu Quantity: ");
						int menu_quantity = sc.nextInt();
						Menu m = new Menu(menu_name,menu_price,menu_quantity);
						MenuDao.insert(m);
						System.out.println("Data Inserted Successfully");
					break;	
					case 2:
						MenuDao.update();
						System.out.println("Data Updated Successfully");
					break;
					case 3:
						System.out.println("Enter which ID you want to Delete");
						int menu_id = sc.nextInt();
						MenuDao.delete(menu_id);
						System.out.println("Data Deleted Successfully");
					break;
					case 4:
						MenuDao.display();
					break;
					case 5:
						System.out.println("Bye Bye :)");
					break;
					default:
						System.out.println("You have Entered Wrong Choice");
					}	
				}
				while(choice1!=5);
			break;	
			case 3:
				int choice2 = 0;
				do
				{
					System.out.println("Press 1 to Add Order Details.");
					System.out.println("Press 2 to Update Order Details.");
					System.out.println("Press 3 to Delete Order Detail.");
					System.out.println("Press 4 to Display Order Details.");
					System.out.println("Press 5 to Exit");
					System.out.println("Please Enter your Choice:");
				choice2 = sc.nextInt();
				switch(choice2)
				{
				case 1:
					OrderDao.totalBill();
					OrderDao.insert();
					System.out.println("Data Inserted Successfully");
				break;
				case 2:
					OrderDao.update();
					System.out.println("Data Updated Successfully");
				break;
				case 3:
					System.out.println("Enter which ID you want to Delete");
					int order_id = sc.nextInt();
					OrderDao.delete(order_id);
					System.out.println("Data Deleted Successfully");
				break;
				case 4:
					OrderDao.display();
				break;
				case 5:
					System.out.println("Bye Bye :)");
					break;
				default:
					System.out.println("You have Entered Wrong Choice");
				}
			}
				while(choice2!=5);
			break;
			case 4:
				int choice3 =0;
				do
				{
					System.out.println("Press 1 to Add Employee Details.");
					System.out.println("Press 2 to Update Employee Details.");
					System.out.println("Press 3 to Delete Employee Detail.");
					System.out.println("Press 4 to Display Employee Details.");
					System.out.println("Press 5 to Exit");
					System.out.println("Please Enter your Choice:");
					choice3 = sc.nextInt();
					switch(choice3)
					{
					case 1:
						System.out.println("Enter the Employee Name: ");
						String employee_name = sc.next();
						System.out.println("Enter the Employee Designation: ");
						String employee_design = sc.next();
						System.out.println("Enter the Employee Contact: ");
						String employee_contact = sc.next();
						Employee e = new Employee(employee_name,employee_design,employee_contact);
						boolean b = EmployeeDao.insert(e);
						System.out.println("Data Inserted Successfully");	
					break;	
					case 2:
						EmployeeDao.update();
						System.out.println("Data Updated Successfully");
					break;
					case 3:
						System.out.println("Enter which ID you want to Delete");
						int E_id = sc.nextInt();
						EmployeeDao.delete(E_id);
						System.out.println("Data Deleted Successfully");
					break;
					case 4:
						EmployeeDao.display();
					break;
					case 5:
						System.out.println("Bye Bye :)");
						break;
					default:
						System.out.println("You have Entered Wrong Choice");
					}	
				}
				while(choice3!=5);
			break;
			case 5:
				System.out.println("Bye Bye :)");
			break;
			default:
				System.out.println("You have Entered Wrong Choice");
			}
		}
		while(ch!=5);
	}	
}
