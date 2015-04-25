package models;

import java.sql.*;

public class MySQLConnect {
 
	/**
	 * An instance of this class
	 */
	private static MySQLConnect instance=new MySQLConnect();
	
	/**
	 * Constructor
	 */
	MySQLConnect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Method to create connection to Database
	 * @return connection status
	 */
	private Connection createConnection()
	{
		Connection myConn=null;
		try{
			myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1","root","root");
		}catch(Exception e)
		{
			
		}
		return myConn;
	}
	
	  public static Connection getConnection() {
	        return instance.createConnection();
	    }
}
