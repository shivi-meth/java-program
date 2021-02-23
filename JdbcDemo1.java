package org.btm.jdbcApp;
import java.sql.*;


public class JdbcDemo1 {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String qry="insert into btm.student values(1,'shivi',78.2)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded & Registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection Established with DBServer");
			stmt=con.createStatement();
			stmt.executeUpdate(qry);
			System.out.println("platform Created");
		}	
			
		catch(ClassNotFoundException|SQLException  e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			if(stmt!=null)
			{
               try
				{
					stmt.close();
				}
               catch(SQLException e)
               
               {
            	   e.printStackTrace();
               }
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Closed  all costly resources ");
		}
		
		
			
		
	}

}
