package com.vam.gt.Timesheet.Timesheet.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Projects")

public class Projects {
	
	

	
	

	


	
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projects_generator")
	@Column(name = "projectsId")
	private int projectsId;

	@Column(name = "Name")
	private String Name;
	@Column(name = "Status")
	private String Status;
	@Column(name = "createDate")
	private Date createDate = new Date(System.currentTimeMillis());

	// creating a relation for projects and tickets.
		@OneToMany(cascade = CascadeType.ALL, mappedBy = "projects", fetch = FetchType.LAZY)
		private List<Tickets> tickets;
		//@JsonManagedReference
//		public List<Tickets> getTickets() {
//			return tickets;
//		}
//
//		public void setTickets(List<Tickets> tickets) {
//			this.tickets = tickets;
//		}
		
		
		
	public int getProjectsId() {
		return projectsId;
	}

	public void setProjectsId(int projectsId) {
		this.projectsId = projectsId;
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

	public Projects(int projectsId, String name, String status, Date createDate) {
		super();
		this.projectsId = projectsId;
		Name = name;
		Status = status;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Projects [projectsId=" + projectsId + ", Name=" + Name + ", Status=" + Status + ", createDate="
				+ createDate + "]";
	}

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

}