package com.restapi.project;


import java.util.Date;


public class Student {
	private int Sno;
	private String Sname;
	private Date dob,doj;
	
	
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getName() {
		return Sname;
	}
	public void setName(String name) {
		this.Sname = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Student [Sno=" + Sno + ", name=" + Sname + ", dob=" + dob
				+ ", doj=" + doj + "]";
	}
    
}
