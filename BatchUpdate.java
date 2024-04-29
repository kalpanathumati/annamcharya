import java.sql.*;
public class  BatchUpdate
{
    public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
		con.setAutoCommit(false);
		Statement stmt=con.createStatement();
		String q1="insert into medicine values('1','paractemol','headache')";
		stmt.addBatch(q1);
		String q2="insert into medicine values('2','dolo','fever')";
		stmt.addBatch(q2);
		String q3="update medicine set disease='cold' where num='3'";
		stmt.addBatch(q3);
		stmt.executeBatch();
		con.commit();
	}
}