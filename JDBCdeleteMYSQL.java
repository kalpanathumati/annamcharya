import java.sql.*;
class JDBCdeleteMYSQL
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aits","root","jkclab");
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

			
			
