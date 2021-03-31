package com.apidelivery.apidelivery.Notification;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.apidelivery.apidelivery.Models.ClientModel;

@TypeNotification(UrgencyLevel.URGENCY)
//@Qualifier("email")//define qual Bean o spring irá usar - olhe o arquivo ActivateClientService.jar
@Component
public class AddressNotify implements Notify {
	
	@Override
	public void noti(ClientModel client, String messege) {
		
		System.out.printf("It notifying, %s to e-mail %s: %s\n",
				client.getName(), client.getAddress(), messege);
	}
}
