package com.vti.lesson11.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutil {
	private Connection con;
	public Connection getConnection() throws SQLException {
		if(con == null || con.isClosed()) {
			String nguon ="jdbc:mysql://localhost:3306/testingsystem";
			String user ="root";
			String pass="123456";
			con=DriverManager.getConnection(nguon, user, pass);
		}
		return con;
	}
	
	public void disconect() throws SQLException {
		if(con != null && !con.isClosed()) {
			con.isClosed();
		}
	}
}
