package com.example.jsfdemo.domain;


import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Wejscie {

	public Date inputDate = new Date();
	public Date getInputDate() {
		return inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	public String input1="";
	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public String getInput3() {
		return input3;
	}

	public void setInput3(String input3) {
		this.input3 = input3;
	}

	public String getInput4() {
		return input4;
	}

	public void setInput4(String input4) {
		this.input4 = input4;
	}

	public String getInput5() {
		return input5;
	}

	public void setInput5(String input5) {
		this.input5 = input5;
	}

	public String getInput6() {
		return input6;
	}

	public void setInput6(String input6) {
		this.input6 = input6;
	}

	public boolean isInputBool() {
		return inputBool;
	}

	public void setInputBool(boolean inputBool) {
		this.inputBool = inputBool;
	}

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

