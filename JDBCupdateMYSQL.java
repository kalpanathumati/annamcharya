import java.sql.*;
class JDBCupdateMYSQL
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aits","root","jkclab");
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

			
			
