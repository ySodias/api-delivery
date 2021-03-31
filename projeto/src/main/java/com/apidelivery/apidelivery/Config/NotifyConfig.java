package com.apidelivery.apidelivery.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apidelivery.apidelivery.Notification.AddressNotify;
import com.apidelivery.apidelivery.Services.ActivateClientService;

@Configuration
public class NotifyConfig {
	
	@Bean
	public AddressNotify notifyAddress() {
		AddressNotify notifier = new AddressNotify("smtp.gmail.com.br");
		notifier.setUpperCase(true);
		
		return notifier;
	}
}
