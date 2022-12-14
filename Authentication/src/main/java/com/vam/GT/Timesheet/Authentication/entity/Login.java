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
	 
	@Column(name="email")
	private String emailId;
	
	@Column(name="password")
	private String password;
	
	@Column(name = "firstName")
	private String FirstName;
	
	@Column(name = "lastName")
	private String LastName;
	
	@Column(name = "totalExperience")
	private float TotalExperience ;
	
	@Column(name = "vamExperience")
	private float vamExperience;
	
	@Column(name = "skillSet")
	private String skillSet;
	
	
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
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	public float getTotalExperience() {
		return TotalExperience;
	}
	public void setTotalExperience(float totalExperience) {
		TotalExperience = totalExperience;
	}
	public float getVamExperience() {
		return vamExperience;
	}
	public void setVamExperience(float vamExperience) {
		vamExperience = vamExperience;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		skillSet = skillSet;
	}
	
	
	
	public Login(long id, String emailId, String password,String firstName, String lastName, float totalExperience, float vamExperience, String skillSet) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.TotalExperience = totalExperience;
		this.vamExperience = vamExperience;
		this.skillSet = skillSet;
		
	}
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Login orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
}