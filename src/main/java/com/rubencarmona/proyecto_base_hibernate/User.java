package com.rubencarmona.proyecto_base_hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	private int id;
	
	@Column
	private String userName;
	
	@Column
	private String userMesagge;	
	

	public User() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMesagge() {
		return userMesagge;
	}

	public void setUserMesagge(String userMesagge) {
		this.userMesagge = userMesagge;
	}
	
	
	
	
}
