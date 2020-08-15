package com.vti.lesson11.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.lesson11.backend.datalayer.AccountRepository;
import com.vti.lesson11.entity.Account;

public class AccountService implements InterfaceService{
	private AccountRepository accountrepository;
	
	public AccountService(){
		accountrepository=new AccountRepository();
	}

	@Override
	public List<Account> getListAccount() throws SQLException {
		return accountrepository.getListAccount();
	}

	@Override
	public Account getAccountByID(int ID) throws SQLException {
		return accountrepository.getAccountByID(ID);
	}

	@Override
	public void isAccountExists(String username) throws SQLException {
		accountrepository.isAccountExists(username);
	}

	@Override
	public void updateAccountByID(String email, int id) throws SQLException {
		accountrepository.updateAccountByID(email, id);
	}

}
