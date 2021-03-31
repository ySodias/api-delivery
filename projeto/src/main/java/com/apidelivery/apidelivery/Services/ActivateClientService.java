package com.apidelivery.apidelivery.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.apidelivery.apidelivery.Models.ClientModel;
import com.apidelivery.apidelivery.Notification.Notify;
import com.apidelivery.apidelivery.Notification.TypeNotification;
import com.apidelivery.apidelivery.Notification.UrgencyLevel;

@Component
public class ActivateClientService {
	
	@TypeNotification(UrgencyLevel.NORMAL)
	//@Qualifier("email")
	@Autowired
	private Notify notifier;
	
	public void active(ClientModel client) {
		client.active();

			notifier.noti(client,"Your Sign Up in the System is Activated!");

	}
}
