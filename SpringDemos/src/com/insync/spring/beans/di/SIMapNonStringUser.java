package com.insync.spring.beans.di;

public class SIMapNonStringUser {
	
	private int id;  
	private String name,email;  
	public SIMapNonStringUser() {}  
	public SIMapNonStringUser(int id, String name, String email) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.email = email;  
	}  
	  
	public String toString(){  
	    return "Id:"+id+" Name:"+name+" Email Id:"+email;  
	}  

}
