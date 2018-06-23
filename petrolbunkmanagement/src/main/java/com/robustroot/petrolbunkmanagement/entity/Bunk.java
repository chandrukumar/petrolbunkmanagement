package com.robustroot.petrolbunkmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bunk_details")
public class Bunk {
	@Id
	@Column(name = "bunk_id")
	Long bunkId;
	String name;
	String mobilenumber;
	String password;
	
	public Long getBunkId() {
		return bunkId;
	}
	public void setBunkId(Long bunkId) {
		this.bunkId = bunkId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
