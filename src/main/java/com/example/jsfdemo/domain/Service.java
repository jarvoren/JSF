package com.example.jsfdemo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Service {
	private String name="";
	public Set<Date> reservationList = new HashSet<Date>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
