package com.admission.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name="stud_campus_visit")
public class StudentVisitor implements Serializable {

	@Id
	private String uid;
	private String studId;
	private String transportBy;
	private String staffId;
	private String visitedWith;
	
	@Transient
	private String name;
	@Transient
	private int mobile;
	@Transient
	private String staffName;
	
	
	public StudentVisitor() {
	}
	public StudentVisitor(String uid, String studId, String transportBy, String staffId, String visitedWith) {
		super();
		this.uid = uid;
		this.studId = studId;
		this.transportBy = transportBy;
		this.staffId = staffId;
		this.visitedWith = visitedWith;
	}
	
	@Override
	public String toString() {
		return "StudentVisitor [uid=" + uid + ", studId=" + studId + ", transportBy=" + transportBy + ", staffId="
				+ staffId + ", visitedWith=" + visitedWith + ", name=" + name + ", mobile=" + mobile + ", staffName="
				+ staffName + "]";
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getTransportBy() {
		return transportBy;
	}
	public void setTransportBy(String transportBy) {
		this.transportBy = transportBy;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getVisitedWith() {
		return visitedWith;
	}
	public void setVisitedWith(String visitedWith) {
		this.visitedWith = visitedWith;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	
}
