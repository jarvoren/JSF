package com.example.jsfdemo.domain;

import java.util.Date;

public class Reservation {

	public Date d;
	public User u;
	public String n;
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	
	
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}

}
