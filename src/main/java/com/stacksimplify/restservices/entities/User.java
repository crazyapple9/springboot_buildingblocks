package com.stacksimplify.restservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity in JPA are POJOs representing data  that can be persisted to the database
//At a high level, an Entity represents a table in a database
//Every instance of entity represents a Row in a table

@Entity
@Table(name = "user")
public class User {
	
	@Id			//This annotation tells JPA that the Instance variable "id" will be the primary key
	@GeneratedValue		//this autogenerates the "id' field's value
	private Long id;
	
	@Column(name = "USER_NAME", length =50, nullable=false,unique=true)		
	private String username;
	
	@Column(name = "FIRST_NAME", length =50, nullable=false)
	private String firstname;
	
	@Column(name = "LAST_NAME", length =50, nullable=false)
	private String lastname;
	
	@Column(name = "EMAIL_ADDRESS", length =50, nullable=false)
	private String email;
	
	@Column(name = "ROLE", length =50, nullable=false)
	private String role;
	
	@Column(name = "SSN", length =50, nullable= false,unique= true)
	private String ssn;
	
	//No Argument Constructor - Mandatory - JPA Entity class needs this
	public User() {		
	}
	
	//Fields Constructor - Optional
	public User(Long id, String username, String firstname, String lastname, String email, String role, String ssn) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}
	
	//Getters and Setters - Mandatory
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//To String - Optional for Bean Logging
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", role=" + role + ", ssn=" + ssn + "]";
	}
		
	
	
	
}
