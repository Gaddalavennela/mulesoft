import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class inserintomovie {
	
	public static void main(String args[])
	{Scanner sc=new Scanner(System.in);
	char[] heroname=sc.nextLine();
		try(Connection c = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres" , "postgres" , "12345")){
			
			if(c != null)
			{
				System.out.println("Connection Established");
				
				Statement stmt1 = c.createStatement();
				String q1 = "select * from movie m where m.actorname=heroname";
				ResultSet rs1 = stmt1.executeQuery(q1);
				while(rs1.next())
				{
					String mname = rs1.getString("mname");
					String actrname = rs1.getString("actorname");
					String actressname = rs1.getString("actressname");
					int year=rs1.getInt("year");
					System.out.println(mname +","+actrname+","+actressname+","+year);
						

				}
			else
			{
				System.out.println("Failed to establish connection");
			}
		rs1.close();
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

