package com.admission.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="campus_course_map")
public class CampusCourse implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String uid;
	private String campusUid;
	private String courseUid;
	public CampusCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CampusCourse(String uid, String campusUid, String courseUid) {
		super();
		this.uid = uid;
		this.campusUid = campusUid;
		this.courseUid = courseUid;
	}
	@Override
	public String toString() {
		return "CampusCourse [uid=" + uid + ", campusUid=" + campusUid + ", courseUid=" + courseUid + "]";
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCampusUid() {
		return campusUid;
	}
	public void setCampusUid(String campusUid) {
		this.campusUid = campusUid;
	}
	public String getCourseUid() {
		return courseUid;
	}
	public void setCourseUid(String courseUid) {
		this.courseUid = courseUid;
	}
	
	

}