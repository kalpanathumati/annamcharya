import java.sql.*;
public class  InsertResult
{
    public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String sQuery="select empid,empname,emmpdes from aitsgoogle";
		ResultSet rs=stmt.executeQuery(sQuery);
		rs.beforeFirst();
		rs.moveToInsertRow();
		rs.updateString("empid","577");
		rs.updateString("empname","sankar");
		rs.updateString("emmpdes","Automation Engineer");
		rs.insertRow();
	}
}