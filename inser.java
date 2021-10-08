import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class inserintomovie {
	
	public static void main(String args[])
	{
		try(Connection c = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres" , "postgres" , "12345")){
			
			if(c != null)
			{
				System.out.println("Connection Established");
				
				Statement stmt1 = c.createStatement();
				
			
				String q1 = "INSERT INTO movies VALUES('MAESTRO','NITIN','NABANATESH',2021)";
				String q2 = "INSERT INTO movies VALUES('DILBECHARA','SUSHANTH','DIVYA'2020)";
				
				stmt.addBatch(q1);
      				stmt.addBatch(q2);
				stmt.executeBatch();
				
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

