package com.vti.lesson11.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.lesson11.entity.Account;

public interface InterfaceRespository {
	public List<Account> getListAccount() throws SQLException;
	public Account getAccountByID(int id) throws SQLException;
	public void isAccountExists(String username) throws SQLException;
	public void updateAccountByID(String email,int id) throws SQLException;
}
