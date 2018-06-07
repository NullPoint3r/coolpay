package com.currency.coolpay;

import org.springframework.stereotype.Service;

import com.currency.coolpay.models.Token;
import com.currency.coolpay.service.AuthenticationService;

@Service
public class TestAuthenticationService implements AuthenticationService {
		
	private Token token = new Token();
		
	@Override
	public boolean authenticate(String username, String apiKey){
		token.setToken("Authenticated");		
		return true;
	}
	
	@Override
	public void disconnect(){
		token.clear();		
	}

	@Override
	public boolean isAuthenticated(){
		return token.getToken() != null && !token.getToken().isEmpty();
	}
	
}	
