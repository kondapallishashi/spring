package com.insync.spring.beans;

public class CINonStringMapUser {
	private int id;
	private String name, email;
	
	public CINonStringMapUser() {
		//Default Constructor
	}
	
	public CINonStringMapUser(int id, String name, String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}

	public String toString() {
		return "ID: "+id+" Name: "+name+" Email: "+email;
	}
}
