package com.vti.lesson11.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.lesson11.backend.businesslayer.AccountService;
import com.vti.lesson11.entity.Account;

public class AccountController {
private AccountService accountservice;
	
	public AccountController() {
		accountservice= new AccountService();
	}
	public List<Account> getListAccount() throws SQLException {
		return accountservice.getListAccount();
	}
	
	public Account getAccountByID(int ID) throws SQLException {
		return accountservice.getAccountByID(ID);
	}
	
	public void isAccountExists(String username) throws SQLException {
		accountservice.isAccountExists(username);
	}
	
	public void updateAccountByID(String email, int id) throws SQLException {
		accountservice.updateAccountByID(email, id);
	}

}
