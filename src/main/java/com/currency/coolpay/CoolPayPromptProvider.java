package com.currency.coolpay;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

import com.currency.coolpay.service.AuthenticationService;

@Component
public class CoolPayPromptProvider implements PromptProvider {
	
	@Autowired
	private AuthenticationService authenticationService;		
	
	@Override
	public AttributedString getPrompt() {
		
		if(authenticationService.isAuthenticated()) {
			return new AttributedString("coolpay:>",
					AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN));
		} else {
			return new AttributedString("coolpay:>",
					AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
		}				
		
	}

}