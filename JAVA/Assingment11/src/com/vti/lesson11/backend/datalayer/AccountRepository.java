package com.vti.lesson11.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.lesson11.entity.Account;
import com.vti.lesson11.utils.JDBCutil;

public class AccountRepository implements InterfaceRespository {
	private JDBCutil jdbcutils;
	
	public AccountRepository() {
		jdbcutils = new JDBCutil();
	}

	@Override
	public List<Account> getListAccount() throws SQLException {
		List<Account> accounts =new ArrayList<>();
		Connection myConnect= jdbcutils.getConnection(); 
		String query1 ="Select Username,Email From `Account`";
		java.sql.Statement statement= myConnect.createStatement();
		ResultSet resultset=statement.executeQuery(query1);
		while (resultset.next()) {
			Account account;
			String username=resultset.getString("Username");
			String email=resultset.getString("Email");
			account=new Account(username,email);
			accounts.add(account);
		}
		myConnect.isClosed();
		return accounts;
	}
	@Override
	public Account getAccountByID(int id) throws SQLException {
		Account account1 = null;
		Connection myConnect= jdbcutils.getConnection(); 
		String query2 ="Select Username,Email From `Account` where AccountID=?";
		PreparedStatement preparestatement= myConnect.prepareStatement(query2);
		preparestatement.setInt(1, id);
		ResultSet resultset=preparestatement.executeQuery();
		while (resultset.next()) {
			String username=resultset.getString("Username");
			String email=resultset.getString("Email");
			account1 =new Account(username,email);
		}
		myConnect.isClosed();
		return account1;
		
	}

	@Override
	public void isAccountExists(String username) throws SQLException {
		Connection myConnect= jdbcutils.getConnection(); 
		String query2 ="Select Username,Email From `Account` where Username=?";
		PreparedStatement preparestatement= myConnect.prepareStatement(query2);
		preparestatement.setString(1, username);
		ResultSet resultset=preparestatement.executeQuery();
		
		if(resultset.next()) {
			System.out.println("user da ton tai");
		}else {
			System.out.println("user khong ton tai");
		}
		myConnect.isClosed();
		
	}

	@Override
	public void updateAccountByID(String email,int id) throws SQLException {
		Connection myConnect= jdbcutils.getConnection(); 
		String query2 ="Update `Account` set email=? where AccountID=?";
		PreparedStatement preparestatement= myConnect.prepareStatement(query2);
		preparestatement.setInt(2, id);
		preparestatement.setString(1, email);
		int sohangdaupdate = preparestatement.executeUpdate();
		System.out.println("so hang da update la" + sohangdaupdate);
		myConnect.isClosed();
	}
}
