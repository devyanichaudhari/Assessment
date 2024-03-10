package com.eb.dao;
import java.sql.*;
import java.util.*;
import com.eb.database.CP;
import com.eb.pojo.Customer;

public class CustomerDao 
{
	public static boolean insert(Customer c)
	{
		boolean f = false;
		try
		{
			Connection conn = CP.createc();
			String query = "insert into customer(cusname,cuscontact,cusaddress) values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, c.getCusName());
			ps.setString(2, c.getCusContact());
			ps.setString(3, c.getCusAddress());
			ps.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static void display() 
	{
		try 
		{
		Connection conn = CP.createc();
		String sql = "select * from customer";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Customer ID\t"+"Customer Name"+"\tCustomer Contact "+"\tCustomer Address");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static boolean update() 
	{
		try
		{
			boolean f = false;
			Connection conn = CP.createc();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Customer Id You want to Update:");
			int id = sc.nextInt();
			System.out.println("Enter the Customer Name You want to Update:");
			String  name  = sc.next();
			System.out.println("Enter the Customer Contact You want to Update:");
			String contact = sc.next();
			System.out.println("Enter the Customer Address You want to Update:");
			String address = sc.next();
			String sql1 = "update customer set cusname='"+name+"',cuscontact='"+contact+"', cusaddress='"+address+"' where cusid="+id;
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
	public static boolean delete(int cusid)
	{
		try
		{
		Connection conn = CP.createc();
		String sql2 = "delete from customer where cusid = ? ";
		PreparedStatement ps = conn.prepareStatement(sql2);
		ps.setInt(1, cusid);
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}