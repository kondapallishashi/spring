package com.insync.spring.beans.di;

public class SINonStringListAnswer {
	private int id;
	private String name;
	private String postedBy;
	
	//Getter & Setter Methods
	//Get method for id;
	public int getId() {
		return id;
	}
	//Set method for id;
	public void setId(int id) {
		this.id=id;
	}
	//Get method for name;
	public String getName() {
		return name;
	}
	
	//Set method for name
	public void setName(String name) {
		this.name=name;
	}
	
	//Get method for postedBy
	public String getPostedBy() {
		return postedBy;
	}
	//Set method for postedBy
	public void setPostedBy(String postedBy) {
		this.postedBy=postedBy;
	}
	
	public String toString() {
		return "ID: "+id+" Name: "+name+" Posted By: "+postedBy;
	}
}
