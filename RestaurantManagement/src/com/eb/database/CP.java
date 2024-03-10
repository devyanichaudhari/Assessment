package com.eb.database;
import java.sql.*;
public class CP 
{
	static Connection con;
	public static Connection createc()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/restaurantmanagement";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return con;
	}
}
