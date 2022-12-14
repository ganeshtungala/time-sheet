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

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "totalExperience",precision=4,scale=2)
	private float totalExperience ;

	@Column(name = "vamExperience",precision=4,scale=2)
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
		return firstName;
	}
	public void setFirstName(String firstName) {
		firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		lastName = lastName;
	}


	public float getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(float totalExperience) {
		totalExperience = totalExperience;
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
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalExperience = totalExperience;
		this.vamExperience = vamExperience;
		this.skillSet = skillSet;

	}


	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}



}