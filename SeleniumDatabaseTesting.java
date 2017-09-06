package DatabaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SeleniumDatabaseTesting {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/";
		String databaseName = "mydatabase";
		String username = "root";
		String password = "root";
		
		try{	
		Class.forName("com.mysql.jdbc.Driver");	
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "2b88797$00");
		
		String sqlQuerry = "Select *  from signupdetails";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sqlQuerry);
		
		result.next();
		System.out.println(result.getString("idsignupdetails"));
		System.out.println(result.getString("EmailAddress"));
		System.out.println(result.getString("ZipCode"));
		System.out.println(result.getString("FirstName"));
		System.out.println(result.getString("LastName"));
		
				}

		catch(Exception e)
		{
			System.out.println(e);				
		}
		finally{
			if(conn!=null)
			{
				conn=null;
			}
		}
		
	}

}
