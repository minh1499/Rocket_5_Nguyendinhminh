package com.vti.lesson11.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.lesson11.backend.presentationlayer.AccountController;
import com.vti.lesson11.entity.Account;

public class Program {
	public static void main(String[] args) throws SQLException {
		AccountController accountcontroller=new AccountController();
//		List<Account> accountList=accountcontroller.getListAccount();
//		for (Account account: accountList) {
//			System.out.println(account.getUsername());
//		}
//		
//		Account accountcantim=accountcontroller.getAccountByID(15);
//		System.out.println(accountcantim.toString());
		
//		accountcontroller.isAccountExists("lua roi");
		accountcontroller.updateAccountByID("chuvietdung@gmail", 1);
		
		
	}
	
}
