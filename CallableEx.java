import java.sql.*;
public class CallableEx
{
    public static void main(String args[]) throws Exception
	{ 
	    try
		{	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
		String sqlp="{call getGoogleName(?,?)}";
		CallableStatement cstmt=con.prepareCall(sqlp);
		cstmt.setString(1,"A584");
		cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
		cstmt.execute();
		String name=cstmt.getString(2);
		System.out.println("A584 name is :"+name);
	    }
	    catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}