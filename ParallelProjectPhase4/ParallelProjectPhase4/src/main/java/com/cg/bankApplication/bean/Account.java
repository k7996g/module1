package com.cg.bankApplication.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int accNo;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "walletId")
	private Wallet wallet;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "customerId")
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account(int accNo, Wallet wallet, Customer customer) {
		super();
		this.accNo = accNo;
		this.wallet = wallet;
		this.customer = customer;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public Account(int accNo, Wallet wallet) {
		super();
		this.accNo = accNo;
		this.wallet = wallet;
	}

	public Account() {
		super();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNo;
		result = prime * result + ((wallet == null) ? 0 : wallet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accNo != other.accNo)
			return false;
		if (wallet == null) {
			if (other.wallet != null)
				return false;
		} else if (!wallet.equals(other.wallet))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", wallet=" + wallet + "]";
	}

}
