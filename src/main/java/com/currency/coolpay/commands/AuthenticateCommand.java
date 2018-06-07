package com.currency.coolpay.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import com.currency.coolpay.service.AuthenticationService;

@ShellComponent
public class AuthenticateCommand {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@ShellMethod("Authenticate to Coolpay API")
    public void connect(String username, String apiKey) {				
		authenticationService.authenticate(username, apiKey);
        return;
    }
	
	@ShellMethod("Disconnect from Cool Pay")
    public void disconnect() {				
		authenticationService.disconnect();
        return;
    }
	
}
