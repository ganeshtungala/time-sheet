package com.vam.gt.Timesheet.Timesheet.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tickets")
public class Tickets {
	 @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name="id")
	   private int id;
	 @Column(name="key")
	   private int key;
	 @Column(name="summary")
	   private String summary;
	 @Column(name="assigned")
	   private String assigned;
	 @Column(name="reporter")
	   private String reporter;
	 @Column(name="type")
	   private String type;
	 @Column(name="status")
	   private String status;
	 @Column(name="resolution")
	   private String resolution;
	 @Column(name="createdDate")
	   private Date createdDate;
	 @Column(name="storypoint")
	   private float storypoint;
	 @Column(name="originalEstimate")
	   private float originalEstimate;
	 @Column(name="epicid")
	   private int epicid;
	 @Column(name="startsprint")
	   private String startsprint;
	 @Column(name="endsprint")
	   private String endsprint;
	 @Column(name="componet")
	   private String component;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getAssigned() {
		return assigned;
	}
	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public float getStorypoint() {
		return storypoint;
	}
	public void setStorypoint(float storypoint) {
		this.storypoint = storypoint;
	}
	public float getOriginalEstimate() {
		return originalEstimate;
	}
	public void setOriginalEstimate(float originalEstimate) {
		this.originalEstimate = originalEstimate;
	}
	public int getEpicid() {
		return epicid;
	}
	public void setEpicid(int epicid) {
		this.epicid = epicid;
	}
	public String getStartsprint() {
		return startsprint;
	}
	public void setStartsprint(String startsprint) {
		this.startsprint = startsprint;
	}
	public String getEndsprint() {
		return endsprint;
	}
	public void setEndsprint(String endsprint) {
		this.endsprint = endsprint;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public Tickets(int id, int key, String summary, String assigned, String reporter, String type, String status,
			String resolution, Date createdDate, float storypoint, float originalEstimate, int epicid,
			String startsprint, String endsprint, String component) {
		super();
		this.id = id;
		this.key = key;
		this.summary = summary;
		this.assigned = assigned;
		this.reporter = reporter;
		this.type = type;
		this.status = status;
		this.resolution = resolution;
		this.createdDate = createdDate;
		this.storypoint = storypoint;
		this.originalEstimate = originalEstimate;
		this.epicid = epicid;
		this.startsprint = startsprint;
		this.endsprint = endsprint;
		this.component = component;
	}
	@Override
	public String toString() {
		return "Tickets [id=" + id + ", key=" + key + ", summary=" + summary + ", assigned=" + assigned + ", reporter="
				+ reporter + ", type=" + type + ", status=" + status + ", resolution=" + resolution + ", createdDate="
				+ createdDate + ", storypoint=" + storypoint + ", originalEstimate=" + originalEstimate + ", epicid="
				+ epicid + ", startsprint=" + startsprint + ", endsprint=" + endsprint + ", component=" + component
				+ "]";
	}
	public Tickets() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	 
	 
}
