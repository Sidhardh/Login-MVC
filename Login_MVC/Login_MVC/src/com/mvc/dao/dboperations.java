package com.mvc.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mvc.model.Login;
import com.mvc.utilities.DbConnection;

public class dboperations {
	public boolean authenticate(Login login)
	{
		String name=login.getName();
		String password=login.getPassword();
		String dbname=null;
		String dbpassword=null;
		Connection con=null;
		try{
			con=DbConnection.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select username,password from user");
			while(rs.next())
			{
				dbname=rs.getString("username");
				dbpassword=rs.getString("password");
				if(name.equals(dbname)&&password.equals(dbpassword))
				{
					return true;
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
