package day16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cbit  ","root","Fayaz@630322");
            PreparedStatement ps=cn.prepareStatement("insert into environment values, ?,?,?");
            
		//	System.out.println(a);
			System.out.println("connection established");
			// TODO Auto-generated method stub
			}catch (SQLException e) {
				e.printStackTrace();
			}

	}

}
