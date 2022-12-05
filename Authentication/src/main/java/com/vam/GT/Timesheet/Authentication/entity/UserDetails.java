package com.vam.GT.Timesheet.Authentication.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")

public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "First_Name")
	private String FirstName;
	
	@Column(name = "Last_Name")
	private String LastName;
	
	@Column(name = "Total_Experience",precision=4,scale=2)
	private float TotalExperience ;
	
	@Column(name = "Vam_Experience",precision=4,scale=2)
	private float VamExperience;
	
	@Column(name = "Skill_Set")
	private String SkillSet;
	
	public UserDetails() {
	}
	public UserDetails(String firstName, String lastName, float totalExperience, float vamExperience, String skillSet) {
		super();
		FirstName = firstName;
		LastName = lastName;
		TotalExperience = totalExperience;
		VamExperience = vamExperience;
		SkillSet = skillSet;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
		return VamExperience;
	}
	public void setVamExperience(float vamExperience) {
		VamExperience = vamExperience;
	}
	public String getSkillSet() {
		return SkillSet;
	}
	public void setSkillSet(String skillSet) {
		SkillSet = skillSet;
	}
	
	
	
	

}

