package com.vam.gt.Timesheet.Timesheet.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Projects")
public class Projects {
	 @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name="id")
	   private int id;
	 @Column(name="Name")
		private String Name;
	 @Column(name="Status")
		private String Status;
	 @Column(name="createDate")
		private Date createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Projects(int id, String name, String status, Date createDate) {
		super();
		this.id = id;
		Name = name;
		Status = status;
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Projects [id=" + id + ", Name=" + Name + ", Status=" + Status + ", createDate=" + createDate + "]";
	}
	public Projects() {
		super();
	}
	
	 
}
