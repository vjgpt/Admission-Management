package com.admission.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="course")
public class Course implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String uid;
	private String course_name;
	private String course_short_name;
	private String course_description;
	private String course_duration;
	private String course_type;
	
	public Course() {
		
	}
	public Course(String uid, String course_name, String course_short_name, String course_description,
			String course_duration, String course_type) {
		super();
		this.uid = uid;
		this.course_name = course_name;
		this.course_short_name = course_short_name;
		this.course_description = course_description;
		this.course_duration = course_duration;
		this.course_type = course_type;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_short_name() {
		return course_short_name;
	}
	public void setCourse_short_name(String course_short_name) {
		this.course_short_name = course_short_name;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public String getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration;
	}
	public String getCourse_type() {
		return course_type;
	}
	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [uid=").append(uid).append(", course_name=").append(course_name)
				.append(", course_short_name=").append(course_short_name).append(", course_description=")
				.append(course_description).append(", course_duration=").append(course_duration)
				.append(", course_type=").append(course_type).append("]");
		return builder.toString();
	}

}
