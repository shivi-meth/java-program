package org.btm.jdbcApp;
import java.sql.*;
public class JdbcDemo4 {
	

		
			 
				public static void main(String[] args) {
					Connection con=null;
					Statement stmt=null;
					String qry1="insert into btm.student values(1,'shivi',90.00)";
					String qry2="insert into btm.student values(2,'shivangi',80.00)";
					String qry3="insert into btm.student values(3,'shalu',45.00)";
					
					
					try {
						Class.forName("com.mysql.jdbc.Driver");
						System.out.println("Driver class loaded & Registered");
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
						System.out.println("Connection Established with DBServer");
						stmt=con.createStatement();
						stmt.executeUpdate(qry1);
						stmt.executeUpdate(qry2);
						stmt.executeUpdate(qry3);
						
						System.out.println("platform Created");
						System.out.println("Data Updated!!!");
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
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
						System.out.println("Closed  all costly resources ");
					}
					
					
						
					
				}

			}











