package com.currency.coolpay.commands;

import java.util.Arrays;
import java.util.List;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import com.currency.coolpay.models.Recipient;

@ShellComponent
public class RecipientsCommand {
	
	@ShellMethod("List your recipients")
	public List<Recipient> recipients(){
		return Arrays.asList(new Recipient("Tara"));
	}
	
	@ShellMethod("Add a new recipient")
	public Recipient add(String name){
		return new Recipient("Salman");
	}
	
	
}
