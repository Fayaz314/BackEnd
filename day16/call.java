package day16;
import java.sql.*;
public class call {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cbit","root","Fayaz@630322");
			CallableStatement cs=con.prepareCall("call_name(?,?)");
			cs.setInt(1, 6);
			cs.setString(2, "Fayaz");
			cs.execute();
			String str="select * from Cricket";
			PreparedStatement ps=con.prepareStatement(str);
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				System.out.println(res.getString(1)+" " +res.getString(2));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
 
}
