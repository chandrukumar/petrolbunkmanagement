package com.robustroot.petrolbunkmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bunk {
	@Id
	Long bunkId;
	String name;
	String mobilenumber;
	String password;
	
	public Bunk(){
		
	}
	public Bunk(Long bunkId, String name ,String mobilenumber ,String password) {
		super();
		this.bunkId = bunkId;
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.password = password;
	}

}
