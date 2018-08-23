package com.admission.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity(name="stud_booking_log")
public class StudBookingLog implements Serializable{
	
	@Id
	private String uid;
	@Transient
	private String name;
	@Transient
	private String agentName;
    @Transient
	private String sname;

	private int amount;

	private String studUid;
	private String staffUid;
	private String agentUid;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getAgentName() {
			return agentName;
		}
	public void setAgentName(String agentName) {
			this.agentName = agentName;
		}
	


	public String getStudUid() {
		return studUid;
	}
	public void setStudUid(String studUid) {
		this.studUid = studUid;
	}
	public String getStaffUid() {
		return staffUid;
	}
	public void setStaffUid(String staffUid) {
		this.staffUid = staffUid;
	}
	public String getAgentUid() {
		return agentUid;
	}
	public void setAgentUid(String agentUid) {
		this.agentUid = agentUid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudBookingLog [uid=").append(uid).append(", name=").append(name).append(", agentName=")
				.append(agentName).append(", sname=").append(sname).append(", amount=").append(amount)
				.append(", studUid=").append(studUid).append(", staffUid=").append(staffUid).append(", agentUid=")
				.append(agentUid).append("]");
		return builder.toString();
	}
	public StudBookingLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
