package com.cg.bankApplication.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bankApplication.bean.Account;
import com.cg.bankApplication.bean.Address;
import com.cg.bankApplication.bean.Customer;
import com.cg.bankApplication.bean.Wallet;
import com.cg.bankApplication.service.IBankApplicationService;

@RestController
public class Client {
	@Autowired
	IBankApplicationService service;

	/*public IBankApplicationService getService() {
		return service;
	}

	public void setService(IBankApplicationService service) {
		this.service = service;
	}*/

	/*@RequestMapping(value = "/createAccount/{amount}", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	public Account createWreck(@RequestBody Customer customer, @PathVariable double amount) {
		Account account = service.create(amount, customer);
		return account;
	}*/

	@RequestMapping(value = "/depositAmount/{accNo}/{amount}", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	public Account depositAmount(@PathVariable int accNo,@PathVariable double amount) {
		
		/*Address add=new Address(235,"India","UP","Mathura","gla",223);
		Customer cus=new Customer(335,"Kaushal","7895764776","kaushal1",add);
		Wallet w=new Wallet(435,1000);
		Account a=new Account(535,w,cus);
		
		System.err.println(service.create(1000,a));
		*/
		System.err.println("outer");
		
		Account account = service.deposit(accNo, amount);
		return account;
	}

	/*@RequestMapping(value = "/withdrawAmount/{accNo}", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	public Account withdrawAmount(@PathVariable int accNo, @RequestBody double amount) {
		Account account = service.deposit(accNo, amount);
		return account;
	}

	@RequestMapping(value = "/fundTransfer", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	public double fundTransfer(@RequestBody int giverAccNo, @RequestBody int receiverAccNo,
			@RequestBody double amount) {
		return service.fundTransfer(giverAccNo, receiverAccNo, amount);
	}

	@RequestMapping(value = "/showBalance", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	public double showBalance(@RequestBody int accNo) {
		return service.showBalance(accNo);
	}*/
}
