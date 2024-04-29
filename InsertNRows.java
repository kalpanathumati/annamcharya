import java.sql.*;
import java.util.*;
class InsertNRows
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
		PreparedStatement pstmt=con.prepareStatement("insert into medicine values(?,?,?)");
		Scanner sin=new Scanner(System.in);
		int i=0;
		while(i<3)
		{
			System.out.println("enter record:"+i);
			System.out.println("enter medicine no:");
			String num=sin.nextLine();
			System.out.println("enter medicine name:");
			String name=sin.nextLine();
			System.out.println("enter disease:");
			String disease=sin.nextLine();
			pstmt.setString(1,num);
			pstmt.setString(2,name);
			pstmt.setString(3,disease);
			pstmt.executeUpdate();
			i++;
		}
	}
}