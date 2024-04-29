import java.sql.*;
public class commit
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
		con.setAutoCommit(false);
		Statement stmt=con.createStatement();
		String UQuery="update aitsgoogle set emmpdes='product owner' where empid='A582'";
        int i=stmt.executeUpdate(UQuery);
        con.commit();
        if(i>0)
            System.out.println(i+"rows are updated");
	}
}	