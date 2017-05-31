package com.mvc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con=null;
	public static Connection getConnection()
	{
		
		try{
		Class.forName("com.mysql.jdbc.Driver");	
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_test","root","root");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void endConnection()
	{
		try{
			con.close();
		}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	
}
