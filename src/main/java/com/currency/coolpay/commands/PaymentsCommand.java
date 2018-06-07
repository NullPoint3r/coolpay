package com.currency.coolpay.commands;

import java.util.Arrays;
import java.util.List;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import com.currency.coolpay.models.Payment;

@ShellComponent
public class PaymentsCommand {
	
	@ShellMethod("List your payments")
	public List<Payment> payments(){
		return Arrays.asList(new Payment("TaraPayment"));
	}
	
	@ShellMethod("Make a new payment")
	public Payment pay(String name){
		return new Payment("TaraPayment");
	}
	
}
