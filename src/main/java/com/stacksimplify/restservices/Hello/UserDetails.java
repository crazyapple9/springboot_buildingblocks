package com.stacksimplify.restservices.Hello;

public class UserDetails {
	
	private String fname;
	private String lname;
	private int id;
	private String city;
	
	
	
	public UserDetails(String fname, String lname, int id, String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		this.city = city;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserDetails [fname=" + fname + ", lname=" + lname + ", id=" + id + ", city=" + city + "]";
	}
	
	
	
	

}
