package ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/testingsystem";
		String username ="root";
		String password="123456";
		
		Connection con= DriverManager.getConnection(dbUrl, username, password);
		getDepartments(con);
	}
	
	public static void getDepartments(Connection con) throws SQLException {
		Statement statement= con.createStatement();
		String question1="select * from department";
		ResultSet hung1= statement.executeQuery(question1);
		while(hung1.next()) {
			System.out.println(hung1.getInt("DepartmentID")+" "+hung1.getString("DepartmentName"));
		}
		
	}

}
