import java.sql.*;
public class  UpdateResult
{
    public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String sQuery="select num,name,disease from medicine";
		ResultSet rs=stmt.executeQuery(sQuery);
		int i=1;
		rs.beforeFirst();
		while(rs.next())
		{
			if((rs.getString("num")).equals("3"))
			{
				String newName=rs.getString("disease")+"cold";
				rs.updateString("disease",newName);
				rs.updateRow();
			}
		}
		rs.beforeFirst();
		System.out.println("num \t name \t disease");
		while(rs.next())
		{
			System.out.println(rs.getString("num")+"\t"+rs.getString("name")+"\t"+rs.getString("disease"));
		}
	}
}
