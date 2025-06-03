package connectctstate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;






class A {
    static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdac", "root", "");
        return connection;
    }
}


class GetData extends A {
	static void getData() throws ClassNotFoundException, SQLException {
		PreparedStatement preparedStatement = getConnection().prepareStatement("Select * from emp");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			double contact = resultSet.getDouble("contact");
			System.out.println(id + " " + name + " " + contact);
		}
		getConnection().close();
	}
}


class InsertData extends A {
	static void insertData() throws ClassNotFoundException, SQLException {
		PreparedStatement preparedStatement = getConnection().prepareStatement("INSERT INTO emp (name, id, contact) VALUES (?, ?, ?)");
		preparedStatement.setString(1, "sunny");
		preparedStatement.setInt(2,1);
		preparedStatement.setDouble(3, 12400);
		preparedStatement.executeUpdate();
		System.out.println("Data has been inserted");
	}
	
}

class DeleteData extends A {
	static void deletedata() throws ClassNotFoundException, SQLException 
	{
		PreparedStatement preparedStatement = getConnection().prepareStatement("delete from emp where id = ?");
		preparedStatement.setInt(1, 1);
		preparedStatement.executeUpdate();
		System.out.println("Data is deleted");
		
		}
}

class UpdateData extends A {
	static void updatedata() throws ClassNotFoundException, SQLException 
	{
		PreparedStatement preparedStatement = getConnection().prepareStatement("update emp set name=? where id=?");
	    preparedStatement.setString(1, "danie");
	    preparedStatement.setInt(2, 1);
	    preparedStatement.executeUpdate();
	    System.out.println("DATA UPDATED");
				 
	}
}

public class Main2 extends A {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 //InsertData.insertData();
		 //UpdateData.updatedata();
		 //DeleteData.deletedata();
		 GetData.getData();
		
	}
}

















