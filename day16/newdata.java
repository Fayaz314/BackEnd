package day16;
import java.sql.DriverManager;
import java.sql.*;
public class newdata {

	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cbit","root","Fayaz@630322");
			String str="select * from ppl";
			Statement st=conn.createStatement();
			PreparedStatement ps=conn.prepareStatement(str);
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				String s=res.getString(0)
			}
		}

	}

}
