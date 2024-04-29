import java.sql.*;
class JDBCdeleteORC
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
			Statement stmt=con.createStatement();
			String dQuery="delete from medicine where num='1'";
			int i=stmt.executeUpdate(dQuery);
			if(i>0)
			{
				System.out.println(i+"record deleted");
			}
			else
			{
				System.out.println("no records inserted,insert operation unsuccessfull");
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}

			
			
