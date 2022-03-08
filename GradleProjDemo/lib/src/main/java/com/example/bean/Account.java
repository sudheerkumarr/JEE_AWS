package com.example.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(unique=true, nullable=false)
	private String email;
	private String password;
	
	// Constructors
	public Account() {}
	public Account(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	// Getter & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

	
}
