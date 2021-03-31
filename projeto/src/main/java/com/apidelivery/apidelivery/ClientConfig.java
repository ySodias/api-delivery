package com.apidelivery.apidelivery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apidelivery.apidelivery.Notification.AddressNotify;

@Configuration
public class ClientConfig {
	
	@Bean
	public AddressNotify notifyAddress() {
		AddressNotify notifier = new AddressNotify("smtp.gmail.com.br");
		notifier.setUpperCase(true);
		
		return notifier;
	}
}
