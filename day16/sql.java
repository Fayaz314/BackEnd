package day16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class sql {

	public static void main(String[] args) {
		try {
			
		
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cbit","root","Fayaz@630322");
		
		System.out.println("connection established");
		// TODO Auto-generated method stub
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
  