package com.cg.bankApplication.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bankApplication.bean.Account;
import com.cg.bankApplication.bean.Customer;
import com.cg.bankApplication.bean.Wallet;
@Transactional
@Repository
public class BankApplicationDaoImpl implements IBankApplicationDao {
	@PersistenceContext
	EntityManager entity;

/*	public EntityManager getEntity() {
		return entity;
	}

	public void setEntity(EntityManager entity) {
		this.entity = entity;
	}
*//*
	Account account;
	Customer customer;
	Wallet wallet;
	ArrayList<String> list=new ArrayList<String>();
	
	public BankApplicationDaoImpl() {
		account = new Account();
		wallet = new Wallet();
	}
*/
	@Override
	public Account create(double amount, Account customer) {
		/*wallet.setWalletId(account.getAccNo());
		wallet.setBalance(amount);
		account.setWallet(wallet);
		account.setCustomer(customer);*/
		
		entity.persist(customer);
		System.out.println(customer + " repo ,mea");
		return customer ;
	}

	@Override
	public Account deposit(int accNo, double amount) {
		
		Account account = entity.find(Account.class, accNo);
		System.err.println(account+"with in found");
		
		double balance=account.getWallet().getBalance();
		account.getWallet().setBalance(balance + amount);
		//list.add("You deposit amount:  " +amount);
		
		entity.merge(account);
		return account;
	}

/*	@Override
	public Account withdraw(int accNo, double amount) {
		
		account = entity.find(Account.class, accNo);
		double balance = account.getWallet().getBalance();
		account.getWallet().setBalance(balance - amount);
		list.add("You withdraw amount:  " +amount);
		entity.merge(account);
		return account;

	}

	@Override
	public double fundTransfer(int giverAccNo, int receiverAccNo, double amount) {
		withdraw(giverAccNo, amount);
		deposit(receiverAccNo, amount);
		list.add("You transfer amount:  " +amount);
		return amount;
	}

	@Override
	public ArrayList<String> printTransaction(int accNo) {
		account = entity.find(Account.class, accNo);
		if(account==null)
		return null;
		else
			return list;
	}

	@Override
	public double showBalance(int accNo) {
        account=entity.find(Account.class, accNo);
        
		return account.getWallet().getBalance();
	}
*/
}
