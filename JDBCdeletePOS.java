import java.sql.*;
class JDBCdeletePOS
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/aits","postgres","jkc");
			Statement stmt=con.createStatement();
			String dQuery="delete from annamacharya99";
			int i=stmt.executeUpdate(dQuery);
			if(i>0)
			{
				System.out.println(i+"record deleted");
			}
			else
			{
				System.out.println("no records deleted,delete operation unsuccessfull");
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

			
			
