package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		String nguon ="jdbc:mysql://localhost:3306/testingsystem";
		String user ="root";
		String pass="123456";
		Connection con=DriverManager.getConnection(nguon, user, pass);
//		inposition(con);
		
		
	}
	
	public static void inposition(Connection con) throws SQLException {
		
		Statement statement= con.createStatement();
		String question2="select * from position";
		ResultSet hung2= statement.executeQuery(question2);
		while(hung2.next()) {
			System.out.println(hung2.getInt("PositionID")+" "+hung2.getString("PositionName"));
		}
	}
	
	

}
