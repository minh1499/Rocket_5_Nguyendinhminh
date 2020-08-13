package ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		isConnectedForTesting();
	}
	
	public static void isConnectedForTesting() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/testingsystem";
		String username ="root";
		String password="123456";
		
		Connection con= DriverManager.getConnection(dbUrl, username, password);
		System.out.println("connect success");
		
	}

}
