package com.tektaurus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tektaurus.bean.Employee;

public class EmployeeDAO {

	Connection con;
	PreparedStatement pre;
	ResultSet res;
	
	public EmployeeDAO()

	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected....");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public int insert(Employee e)

	{
		System.out.println("In Insert");
		int ra=0;
		try
		{
			pre=con.prepareStatement("insert into student values(?,?,?,?,?)");
			pre.setInt(1, e.geteid());
			pre.setString(2,e.geteName());
			pre.setString(3, e.geteMobile());
			pre.setString(4,e.geteAddress());
			pre.setString(5, e.geteStream());
			ra=pre.executeUpdate();
			pre.close();
			
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ra;
	}
	public int update(Employee e)

	{
		System.out.println("In Update");
		int ra=0;
		try
		{
			pre=con.prepareStatement("update student set name=?,mobile=?,address=?,stream=? where eid=?");
			pre.setInt(5, e.geteid());
			pre.setString(1,e.geteName());
			pre.setString(2, e.geteMobile());
			pre.setString(3,e.geteAddress());
			pre.setString(4, e.geteStream());
			ra=pre.executeUpdate();
			pre.close();
			
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ra;
	}
	public int delete(int eid)

	{
		System.out.println("In Delete");
		int ra=0;
		try
		{
			pre=con.prepareStatement("delete from employee where eid=?");
			pre.setInt(1, eid);
			
			ra=pre.executeUpdate();
			pre.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ra;
	}
	public ResultSet retrieve(int eid)
	{
		System.out.println("In Retrieve");
		try
		{
			
			pre=con.prepareStatement("select * from employee where eid=?");
			pre.setInt(1,eid);
			res=pre.executeQuery();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return res;
	}
}
