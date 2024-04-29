import java.sql.*;
class JDBCupdateORC
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
			Statement stmt=con.createStatement();
			String uQuery="update medicine set disease='cough'where num='3'";
			int i=stmt.executeUpdate(uQuery);
			if(i>0)
			{
				System.out.println(i+"record updated");
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

			
			
