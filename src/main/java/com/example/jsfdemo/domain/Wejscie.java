package com.example.jsfdemo.domain;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@ApplicationScoped
public class Wejscie {

	public String input1="";
	public String input2="";
	public String input3="";
	public String input4="";
	public String input5="";
	public String input6="";
	public boolean  inputBool=false;
	
	public Wejscie() {
		input1="";
		input2="";
		input3="";
		input4="";
		input5="";
		input6="";
		inputBool=false;
		
	}
}

