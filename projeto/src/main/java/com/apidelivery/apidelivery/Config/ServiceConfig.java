package com.apidelivery.apidelivery.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apidelivery.apidelivery.Notification.Notify;
import com.apidelivery.apidelivery.Services.ActivateClientService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public ActivateClientService activateClientService(Notify noti) {
		return new ActivateClientService(noti);
	}
}
