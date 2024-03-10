package com.eb.dao;

import java.sql.*;
import java.util.*;
import com.eb.database.CP;
import com.eb.pojo.Employee;
public class EmployeeDao 
{
	public static boolean insert(Employee e)
	{
		boolean f = false;
		try
		{
			Connection conn = CP.createc();
			String query = "insert into employee(Ename,Edesignation,Econtact) values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, e.getEname());
			ps.setString(2, e.getEdesignation());
			ps.setString(3, e.getEcontact());
			ps.executeUpdate();
			f=true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	public static void display() 
	{
		try 
		{
		Connection conn = CP.createc();
		String sql = "select * from employee";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Employee ID\t"+"Employee Name"+"\tEmployee Designation "+"\tEmployee Contact");
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
			System.out.println("Enter the Employee Id You want to Update:");
			int id = sc.nextInt();
			System.out.println("Enter the Employee Name You want to Update:");
			String  name  = sc.next();
			System.out.println("Enter the Employee Contact You want to Update:");
			String contact = sc.next();
			System.out.println("Enter the Employee Designation You want to Update:");
			String designation = sc.next();
			String sql1 = "update employee set Ename='"+name+"',Edesignation='"+designation+"', Econtact='"+contact+"' where Eid="+id;
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
		String sql2 = "delete from employee where Eid = ? ";
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
