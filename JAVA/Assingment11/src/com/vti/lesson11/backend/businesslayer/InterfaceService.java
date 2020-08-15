package com.vti.lesson11.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.lesson11.entity.Account;

public interface InterfaceService {
	public List<Account> getListAccount() throws SQLException;
	public Account getAccountByID(int ID) throws SQLException;
	public void isAccountExists(String username) throws SQLException;
	public void updateAccountByID(String email,int id) throws SQLException;
}
