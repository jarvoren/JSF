package com.example.jsfdemo.domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User {

	private String name="";
	private String surname="";
	private String password="";
	private boolean admin=false;
	public boolean logedIn=false;
	
	
	public boolean isLogedIn() {
		return logedIn;
	}
	public void setLogedIn(boolean logedIn) {
		this.logedIn = logedIn;
	}
	public User(){}
	
	public void logIn(){logedIn=true;}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
