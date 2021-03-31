package com.apidelivery.apidelivery.Services;

import org.springframework.stereotype.Component;


import com.apidelivery.apidelivery.Models.ClientModel;
import com.apidelivery.apidelivery.Notification.Notify;

@Component
public class ActivateClientService {
	
	private Notify notifier;
	
	public ActivateClientService(Notify notifier) {
		this.notifier = notifier;
		
		System.out.println("ActivateClientService: "+notifier);
	}
	
	public void active(ClientModel client) {
		client.active();
		
		notifier.noti(client,"Your Sign Up in the System is Activated!");
	}
	
}
