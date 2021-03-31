package com.apidelivery.apidelivery.Notification;


import com.apidelivery.apidelivery.Models.ClientModel;


public class AddressNotify implements Notify {
	
	private boolean upperCase;
	private String hostServidorSmtp;
	
	public AddressNotify(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
	}
	
	@Override
	public void noti(ClientModel client, String messege) {
		if (this.upperCase) {
			messege = messege.toUpperCase();
		}
		
		
		System.out.printf("It notifying, %s to e-mail %s usando SMTP: %s, %s\n",
				client.getName(), client.getAddress(), this.hostServidorSmtp, messege);
	}

	public boolean isUpperCase() {
		return upperCase;
	}

	public void setUpperCase(boolean upperCase) {
		this.upperCase = upperCase;
	}

	public void setHostServidorSmtp(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
	}
}
