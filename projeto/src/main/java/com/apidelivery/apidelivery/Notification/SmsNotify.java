package com.apidelivery.apidelivery.Notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.apidelivery.apidelivery.Models.ClientModel;

@TypeNotification(UrgencyLevel.NORMAL)
//@Primary - Primoridade para esse Bean
//@Qualifier("sms")
@Component
public class SmsNotify implements Notify{
	
	@Override
	public void noti(ClientModel client, String messege) {
		System.out.printf("It notifying, %s to phone %s: %s\n",
				client.getName(), client.getPhone(), messege);
	}

}
