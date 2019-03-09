package com.cg.bankApplication.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bankApplication.bean.Account;
import com.cg.bankApplication.bean.Customer;
import com.cg.bankApplication.dao.IBankApplicationDao;
@Transactional
@Service
public class BankApplicationServiceImpl implements IBankApplicationService {
	
	
	@Autowired
	IBankApplicationDao repo;

	/*public IBankApplicationDao getRepo() {
		return repo;
	}

	public void setRepo(IBankApplicationDao repo) {
		this.repo = repo;
	}*/

	@Override
	public Account create(double amount, Account customer) {

		return repo.create(amount, customer);
	}

	@Override
	public Account deposit(int accNo, double amount) {

		return repo.deposit(accNo, amount);
	}

	/*@Override
	public Account withdraw(int accNo, double amount) {

		return repo.withdraw(accNo, amount);
	}

	@Override
	public double fundTransfer(int giverAccNo, int receiverAccNo, double amount) {

		return repo.fundTransfer(giverAccNo, receiverAccNo, amount);
	}

	@Override
	public ArrayList<String> printTransaction(int accNo) {

		return repo.printTransaction(accNo);
	}

	@Override
	public double showBalance(int accNo) {

		return repo.showBalance(accNo);
	}
*/
}
