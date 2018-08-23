package com.admission.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name="stud_enquiry")
public class StudentEnquiry implements Serializable{
	
	@Id
	private String uid;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private int mobile;
	private String address;
	private String fatherName;
	private String occupation;
	private String ccbUid;
	private String sourceKnow;
	private String qualification;
	private String status;
	@Column(name="last_assigned_to")
	private String lastAssigned;
	@Transient
	private String campus;
	@Transient
	private String course;
	@Transient
	private String branch;
	
	
	public StudentEnquiry() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getCampus() {
		return campus;
	}


	public void setCampus(String campus) {
		this.campus = campus;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public StudentEnquiry(String uid, String name, Date dob, int mobile, String address, String fatherName,
			String occupation, String ccbUid, String sourceKnow, String qualification, String status,
			String lastAssigned) {
		super();
		this.uid = uid;
		this.name = name;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.fatherName = fatherName;
		this.occupation = occupation;
		this.ccbUid = ccbUid;
		this.sourceKnow = sourceKnow;
		this.qualification = qualification;
		this.status = status;
		this.lastAssigned = lastAssigned;
	}


	@Override
	public String toString() {
		return "StudentEnquiry [uid=" + uid + ", name=" + name + ", dob=" + dob + ", mobile=" + mobile + ", address="
				+ address + ", fatherName=" + fatherName + ", occupation=" + occupation + ", ccbUid=" + ccbUid
				+ ", sourceKnow=" + sourceKnow + ", qualification=" + qualification + ", status=" + status
				+ ", lastAssigned=" + lastAssigned + "]";
	}


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


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getCcbUid() {
		return ccbUid;
	}


	public void setCcbUid(String ccbUid) {
		this.ccbUid = ccbUid;
	}


	public String getSourceKnow() {
		return sourceKnow;
	}


	public void setSourceKnow(String sourceKnow) {
		this.sourceKnow = sourceKnow;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getLastAssigned() {
		return lastAssigned;
	}


	public void setLastAssigned(String lastAssigned) {
		this.lastAssigned = lastAssigned;
	}
	

	
}
