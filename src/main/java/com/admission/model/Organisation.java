package com.admission.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="organisation")
public class Organisation implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String uid;
	private String name;
	private String shortName;
	private String tagLine;
	public Organisation() {
		// TODO Auto-generated constructor stub
	}
	public Organisation(String uid, String name, String shortName, String tagLine) {
		super();
		this.uid = uid;
		this.name = name;
		this.shortName = shortName;
		this.tagLine = tagLine;
	}
	@Override
	public String toString() {
		return "Organisation [uid=" + uid + ", name=" + name + ", shortName=" + shortName + ", tagLine=" + tagLine
				+ "]";
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
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getTagLine() {
		return tagLine;
	}
	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}
	
	
	
}
