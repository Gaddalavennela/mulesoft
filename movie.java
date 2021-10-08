import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class movie {
	
	public static void main(String args[])
	{
		try(Connection c = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres" , "postgres" , "12345")){
			
			if(c != null)
			{
				System.out.println("Connection Established");
				
				Statement stmt1 = c.createStatement();
				
			
				String q1 = "create table movie(mname text,actorname text,actressname text,year integer)";
				
			
			
				stmt1.executeUpdate(q1);
				
				
				
			}
			else
			{
				System.out.println("Failed to establish connection");
			}
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

