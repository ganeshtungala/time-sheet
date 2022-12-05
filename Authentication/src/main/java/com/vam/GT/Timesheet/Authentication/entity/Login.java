package com.vam.GT.Timesheet.Authentication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Login {

	 @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name="id")
	   private long id;
	@Column(name="emailId")
	private String emailId;

	@Column(name="password")
	private String password;
	
	
	
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	



	



	public Login(long id, String emailId, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
		
	}



	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}



	

	
	
	}