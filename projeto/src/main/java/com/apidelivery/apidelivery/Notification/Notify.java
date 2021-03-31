package com.apidelivery.apidelivery.Notification;

import com.apidelivery.apidelivery.Models.ClientModel;


public interface Notify {

	void noti(ClientModel client, String messege);

}