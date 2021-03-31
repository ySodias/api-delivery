package com.apidelivery.apidelivery.Models;


public class ClientModel {

	private String name;
	private String address;
	private String phone;
	private boolean active = false;
	
	public ClientModel(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public boolean isActive() {
		return active;
	}
	public void active(){
		this.active = true;
	}
}
