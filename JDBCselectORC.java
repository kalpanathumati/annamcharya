import java.sql.*;
public class JDBCselectORC
{
    public static void main(String[] args)
	{
    try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
		Statement stmt=con.createStatement();
		String sQuery="select * from aitsgoogle";
		ResultSet rs=stmt.executeQuery(sQuery);
		int i=1;
		while(rs.next())
		{
			System.out.println("google employee:"+i);
			System.out.println("********");
			System.out.println("ID:"+rs.getString("empid")+"\t");
			System.out.println("Name:"+rs.getString("empname")+"\t");
			System.out.println("designation:"+rs.getString("emmpdes")+"\n");
			i++;
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

