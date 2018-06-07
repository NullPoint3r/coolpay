package com.currency.coolpay.service;

public interface AuthenticationService {

	boolean authenticate(String username, String apiKey);

	void disconnect();

	boolean isAuthenticated();

}