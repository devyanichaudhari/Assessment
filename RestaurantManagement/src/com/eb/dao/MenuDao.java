package com.eb.dao;

import java.sql.*;
import java.util.*;

import com.eb.database.CP;
import com.eb.pojo.Menu;

public class MenuDao 
{
	public static boolean insert(Menu m)
	{
		boolean f1 = false;
		try
		{
			Connection conn = CP.createc();
			String query = "insert into menu(Mname,Price,mquant) values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, m.getMenuName());
			ps.setInt(2, m.getPrice());
			ps.setInt(3, m.getQuantity());
			ps.executeUpdate();
			f1=true;
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
		String sql = "select * from menu";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Menu ID\t"+"Menu Name"+"\tMenu Price "+"\tMenu Quantity");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getInt(4));
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
			boolean f1 = false;
			Connection conn = CP.createc();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Menu Id You want to Update:");
			int id = sc.nextInt();
			System.out.println("Enter the Menu Name You want to Update:");
			String  name  = sc.next();
			System.out.println("Enter the Menu Price You want to Update:");
			int price = sc.nextInt();
			System.out.println("Enter the Menu Quantity You want to Update:");
			int quantity = sc.nextInt();
			String sql1 = "update Menu set Mname='"+name+"',Price='"+price+"', mquant='"+quantity+"' where mid="+id;
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.executeUpdate();
			f1 = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static boolean delete(int pid)
	{
		try
		{
		Connection conn = CP.createc();
		String sql2 = "delete from Menu where mid = ? ";
		PreparedStatement ps = conn.prepareStatement(sql2);
		ps.setInt(1, pid);
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}