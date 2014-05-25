package com.example.jsfdemo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Service {
	private String name="";
	public List<Reservation> reservationList = new ArrayList<Reservation>();

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String reserve(Date data , String username){
		Reservation r = new Reservation();
		r.d=data;
		r.u.setName(username);
		r.n=this.getName();
		reservationList.add(r);
		return "listReservations?faces-redirect=true";
	}
}
