package com.admission.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="login")
public class Login implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String uid;
	private String loginId;
	private String password;
	private String type;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String uid, String loginId, String password, String type) {
		super();
		this.uid = uid;
		this.loginId = loginId;
		this.password = password;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Login [uid=" + uid + ", loginId=" + loginId + ", password=" + password + ", type=" + type + "]";
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
