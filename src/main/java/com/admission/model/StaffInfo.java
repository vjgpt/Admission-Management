package com.admission.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="staff_info")
public class StaffInfo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String uid;
	private String name;
	private String loginUid;
	
	
	public StaffInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffInfo(String uid, String name, String loginUid) {
		super();
		this.uid = uid;
		this.name = name;
		this.loginUid = loginUid;
	}
	@Override
	public String toString() {
		return "StaffInfo [uid=" + uid + ", name=" + name + ", loginId=" + loginUid + "]";
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
	public String getLoginId() {
		return loginUid;
	}
	public void setLoginId(String loginUid) {
		this.loginUid = loginUid;
	}

	
}
