package day16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class sql1 {
	public static void main(String[]args) {
		try {
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cbit","root","Fayaz@630322");
	String str="select* from ppl";
	
			System.out.println("Connection establishe");
		PreparedStatement ps=cn PrepareStatement("insert into environment values"(?,?,?));
		ps.setString(0, null);
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
