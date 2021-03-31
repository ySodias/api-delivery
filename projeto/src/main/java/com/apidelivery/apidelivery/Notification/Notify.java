package com.apidelivery.apidelivery.Notification;

import org.springframework.stereotype.Component;

import com.apidelivery.apidelivery.Models.ClientModel;

@Component
public interface Notify {

	void noti(ClientModel client, String messege);

}