package com.apidelivery.apidelivery.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apidelivery.apidelivery.Models.ClientModel;
import com.apidelivery.apidelivery.Notification.Notify;

@Component
public class ActivateClientService {
	
	//torna @Autowired opcional
	@Autowired(required = false)
	private Notify notifier;
	
/*	public ActivateClientService(Notify notifier) {
		this.notifier = notifier;
		
		System.out.println("ActivateClientService: "+notifier);
	}*/
	
	public void active(ClientModel client) {
		client.active();
		if (notifier != null) {
			notifier.noti(client,"Your Sign Up in the System is Activated!");
		}else {
			System.out.println("Não existe!");
		}

	}
	
/*	@Autowired
	public void setNotifier(Notify notifier) {
		this.notifier = notifier;
	}*/
}
