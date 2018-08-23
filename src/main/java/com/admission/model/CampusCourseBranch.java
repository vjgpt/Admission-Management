package com.admission.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="campus_course_branch_map")
public class CampusCourseBranch implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String uid;
	private String campusCourseUid;
	private String branchUid;
	public CampusCourseBranch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CampusCourseBranch(String uid, String campusCourseUid, String branchUid) {
		super();
		this.uid = uid;
		this.campusCourseUid = campusCourseUid;
		this.branchUid = branchUid;
	}
	@Override
	public String toString() {
		return "CampusCourseBranch [uid=" + uid + ", campusCourseUid=" + campusCourseUid + ", branchUid=" + branchUid
				+ "]";
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCampusCourseUid() {
		return campusCourseUid;
	}
	public void setCampusCourseUid(String campusCourseUid) {
		this.campusCourseUid = campusCourseUid;
	}
	public String getBranchUid() {
		return branchUid;
	}
	public void setBranchUid(String branchUid) {
		this.branchUid = branchUid;
	}
	
	
}
