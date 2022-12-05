package com.vam.gt.Timesheet.Timesheet.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Timesheet")
public class Timesheet {
	 @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name="id")
	   private int id;
	 @Column(name="logHours")
		private Time logHours;
	 @Column(name="logDesc")
		private String logDesc;
	 @Column(name="logDate")
		private Date logDate;
	 @Column(name="Sprint")
		private String Sprint;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Time getLogHours() {
		return logHours;
	}
	public void setLogHours(Time logHours) {
		this.logHours = logHours;
	}
	public Date getLogDate() {
		return logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	public String getSprint() {
		return Sprint;
	}
	public void setSprint(String sprint) {
		Sprint = sprint;
	}
	
	public String getLogDesc() {
		return logDesc;
	}
	public void setLogDesc(String logDesc) {
		this.logDesc = logDesc;
	}
	public Timesheet(int id, Time logHours, Date logDate,String logDesc, String sprint) {
		super();
		this.id = id;
		this.logHours = logHours;
		this.logDate = logDate;
		this.logDesc=logDesc;
		Sprint = sprint;
	}
	public Timesheet() {
		super();
	}
	@Override
	public String toString() {
		return "Timesheet [id=" + id + ", logHours=" + logHours + ", logDate=" + logDate + ",logDesc=" +logDesc+" Sprint=" + Sprint + "]";
	}
	
}
