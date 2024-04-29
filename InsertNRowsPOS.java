import java.sql.*;
import java.util.*;
class InsertNRowsPOS
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/aits","postgres","jkc");
		PreparedStatement pstmt=con.prepareStatement("insert into medicine values(?,?,?)");
		Scanner sin=new Scanner(System.in);
		int i=0;
		while(i<3)
		{
			System.out.println("enter record:"+i);
			System.out.println("enter medicine num:");
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