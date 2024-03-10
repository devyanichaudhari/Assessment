package com.eb.dao;

import java.sql.*;
import com.eb.database.CP;
import com.eb.pojo.Orders;
public class OrderDao {

	
	/*public static void display() 
	{
		//pending display
		
		try 
		{
		Connection conn = CP.createc();
		String sql = "select * from orders";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Order ID\t"+"Order totalBill");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+rs.getInt(2));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
*/
	public static boolean insert(Orders o)
	{
		try
		{
		Connection conn = CP.createc();
		String sql2 = "insert into Orders(totalprice) values(?) ";
		PreparedStatement ps = conn.prepareStatement(sql2);
		ps.setInt(1, o.getTotalbill());
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
	

}