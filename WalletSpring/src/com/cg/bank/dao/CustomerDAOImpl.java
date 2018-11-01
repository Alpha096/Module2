package com.cg.bank.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.bank.dto.Customer;
@Repository("customerdao")
public class CustomerDAOImpl implements ICustomerDAO{
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void createAccount(Customer customer) {
		em.persist(customer);
		em.flush();
	}

	@Override
	public void deposit(String mobileNo, double amount){
		Customer c1 = em.find(Customer.class, mobileNo);
		double amt =c1.getInitialBalance();
		amt=amt+amount;
		c1.setInitialBalance(amt);
		em.flush();
	}

	@Override
	public void withdraw(String mobileNo, double amount) {
		Customer c2 = em.find(Customer.class, mobileNo);
		double amt =c2.getInitialBalance();
		amt=amt-amount;
		c2.setInitialBalance(amt);
		em.flush();
		
	}

	@Override
	public double checkBalance(String mobileNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void fundTransfer(String sender, String reciever, double amount) {
		// TODO Auto-generated method stub
	}

}
