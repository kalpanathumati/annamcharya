//JDBCCreate.java
import java.sql.*;
public class JDBCcreate
{
    public static void main(String[] args)
	{
    String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
    String dbURL= "jdbc:oracle:thin:@localhost:1521:XE";
    String user = "system";
    String pass = "jkc"; 
    Connection conn = null;
    Statement stmt = null;
    try
	{
        Class.forName(jdbcDriver);
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(dbURL,user,pass);
        System.out.println("Creating database...");
        stmt = conn.createStatement();
        if(stmt!=null)
		{
           System.out.println("connection established");
           String sqlq ="create table medicine(num varchar(20),name varchar(20),disease varchar(20))"; 
           stmt.executeUpdate(sqlq);
           System.out.println("Table created successfully...");
       }
    }
    catch(ClassNotFoundException|SQLException e)
	{
        e.printStackTrace();
    } 
 }
}