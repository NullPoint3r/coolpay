package com.currency.coolpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class CoolpayApplication {

	public static void main(String[] args) {

		String[] disabledCommands = {"--spring.shell.command.script.enabled=false",
									 "--spring.shell.command.exit.enabled=false"};									 
		String[] fullArgs = StringUtils.concatenateStringArrays(args, disabledCommands);
		SpringApplication.run(CoolpayApplication.class, fullArgs);

	}
}
