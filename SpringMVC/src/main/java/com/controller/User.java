package com.controller;

public class User {
	private String name,contact;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", contact=" + contact + "]";
	}
	
}
