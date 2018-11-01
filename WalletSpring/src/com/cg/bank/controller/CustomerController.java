package com.cg.bank.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bank.dto.Customer;
import com.cg.bank.service.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	ICustomerService customerservice;
	@RequestMapping(value="/home")
	public String getAllCust(@ModelAttribute("my") Customer cust) {
		return "AddCustomer";	 
	}
	
	@RequestMapping(value="adddata", method=RequestMethod.POST )
	public String addMobileData(@Valid@ModelAttribute("my") Customer cust){
		customerservice.createAccount(cust);
		return "Success";
	}
	
	@RequestMapping(value="/deposit")
	public String getDeposit(@ModelAttribute("depo") Customer cust){
		return "deposit";
	}
	
	@RequestMapping(value="depositamt", method=RequestMethod.POST )
	public String depositAmt(@Valid@ModelAttribute("depo") Customer cust){
		customerservice.deposit(cust.getMobileNo(), cust.getInitialBalance());
		return "null";
	}
	
	@RequestMapping(value="/withdraw")
	public String getWithdraw(@ModelAttribute("with") Customer cust){
		return "withdraw";
	}
	
	@RequestMapping(value="withdrawamt", method=RequestMethod.POST )
	public String withdrawAmt(@Valid@ModelAttribute("with") Customer cust){
		customerservice.withdraw(cust.getMobileNo(), cust.getInitialBalance());
		return "Success";
	}
}
