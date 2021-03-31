package com.apidelivery.apidelivery.Notification;


import org.springframework.stereotype.Component;

import com.apidelivery.apidelivery.Models.ClientModel;

//@Component
public class AddressNotify implements Notify {
	
	
	
	@Override
	public void noti(ClientModel client, String messege) {
		
		System.out.printf("It notifying, %s to e-mail %s: %s\n",
				client.getName(), client.getAddress(), messege);
	}
}
