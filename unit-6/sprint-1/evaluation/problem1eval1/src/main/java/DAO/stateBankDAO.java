package DAO;

import javabean.account;

public interface stateBankDAO {
	public account findAccountById(int id);
	String saveAccount(account account);
	String deleteaccountById(int id);
	String withdrawFromaccount(double amount,int accountId);
//	String depositInAccount(double amount,int accountId)
}
