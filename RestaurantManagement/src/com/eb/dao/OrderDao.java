package com.eb.dao;

import java.sql.*;
import java.util.Scanner;

import com.eb.database.CP;
import com.eb.pojo.Menu;
import com.eb.pojo.Orders;
public class OrderDao {
	static int price,quantity;
	static Orders o  = new Orders();
	static Menu m  = new Menu();
	static String name;
	public static void totalBill()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Menu Name Customer Ordered");
		name = sc.next();
		m.setMenuName(name);
		System.out.println("Enter Price of the Menu");
		int price = sc.nextInt();
		m.setPrice(price);
		System.out.println("Enter Quantity Customer Ordered");
		int quantity = sc.nextInt();
		int total = price*quantity;
		o.setTotalbill(total);
	}

	
	public static void display() 
	{		
		try 
		{
		Connection conn = CP.createc();
		String sql = "select * from orders";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Order ID\t"+"Order totalBill");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t\t"+rs.getInt(2));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static boolean insert()
	{
		try
		{
		Connection conn = CP.createc();
		String sql2 = "insert into Orders(totalprice) values(?) ";
		PreparedStatement ps = conn.prepareStatement(sql2);
		ps.setInt(1,o.getTotalbill());
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static boolean delete(int oid)
	{
		try
		{
		Connection conn = CP.createc();
		String sql2 = "delete from Orders where oid = ? ";
		PreparedStatement ps = conn.prepareStatement(sql2);
		ps.setInt(1, oid);
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static boolean update() 
	{
		try
		{
			boolean f = false;
			Connection conn = CP.createc();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Order Id You want to Update:");
			int id = sc.nextInt();
			System.out.println("Enter the TotalBill You want to Update:");
			int totalbill = sc.nextInt();
			String sql1 = "update orders set totalprice='"+totalbill+"' where oid="+id;
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.executeUpdate();
			f = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}