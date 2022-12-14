package com.vam.gt.Timesheet.Timesheet.Entity;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Timesheet")

public class Timesheet {
    
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "timesheet_generator")
	@Column(name = "timesheetId")
	private int timesheetId;


	@Column(name = "logHours")
	private Time logHours;

	@Column(name = "logDesc")
	private String logDesc;
	@Column(name = "Sprint")
	private String Sprint;
	@Column(name = "logDate")
	private Date logDate = new Date(System.currentTimeMillis());
	
	
	
	//creating a relation between projects and tickets
	
	@ManyToOne
	@JoinColumn(name = "projectsId")
	private Projects projects;
	
	public Projects getProjects() {
		return projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}
	@ManyToOne
	@JoinColumn(name = "ticketsId")
	private Tickets tickets;
	
	public Tickets getTickets() {
		return tickets;
	}
	
	
	
	public int getTimesheetId() {
		return timesheetId;
	}
	

	public void setTimesheetId(int timesheetId) {
		this.timesheetId = timesheetId;
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


	public Timesheet(int timesheetId, Time logHours, Date logDate, String logDesc, String sprint) {
		super();
		this.timesheetId = timesheetId;
		this.logHours = logHours;
		this.logDate = logDate;
		this.logDesc = logDesc;
		this.Sprint = sprint;
	}

	public Timesheet() {
		super();
	}

	@Override
	public String toString() {
		return "Timesheet [timesheetId=" + timesheetId + ", logHours=" + logHours + ", logDate=" + logDate + ",logDesc="
				+ logDesc + " Sprint=" + Sprint + "]";
	}

}
