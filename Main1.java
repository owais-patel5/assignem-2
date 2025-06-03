package connectctstate;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main1 {
	public static void main(String[] args) throws SQLException  {

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		try (ResultSet connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdac", "root", "")
				.createStatement().executeQuery("select * from emp");) {
			while (connection.next()) {
				int id = connection.getInt("id");              
	            String name = connection.getString("name"); 
	            System.out.println("ID: "+id+"  "+"Name: "+name);
			}
			connection.close();
		}
	}
}