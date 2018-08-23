package com.admission.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="campus")
public class Campus implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String uid;
	private String orgUid;
	private String name;
	private String shortName;
	private String addressUid;
	public Campus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Campus(String uid, String orgUid, String name, String shortName, String addressUid) {
		super();
		this.uid = uid;
		this.orgUid = orgUid;
		this.name = name;
		this.shortName = shortName;
		this.addressUid = addressUid;
	}
	@Override
	public String toString() {
		return "Campus [uid=" + uid + ", orgUid=" + orgUid + ", name=" + name + ", shortName=" + shortName
				+ ", addressUid=" + addressUid + "]";
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getOrgUid() {
		return orgUid;
	}
	public void setOrgUid(String orgUid) {
		this.orgUid = orgUid;
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
	public String getAddressUid() {
		return addressUid;
	}
	public void setAddressUid(String addressUid) {
		this.addressUid = addressUid;
	}
	
	
}
