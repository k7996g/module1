package com.cg.bankApplication.dao;

import java.util.ArrayList;

import com.cg.bankApplication.bean.Account;
import com.cg.bankApplication.bean.Customer;

public interface IBankApplicationDao {
	Account create(double amount,Account customer);
	Account deposit(int accNo,double amount);
	/*Account withdraw(int accNo,double amount);
	double fundTransfer(int giverAccNo,int receiverAccNo,double amount);
	ArrayList<String> printTransaction(int accNo);
	double showBalance(int accNo);*/
}
