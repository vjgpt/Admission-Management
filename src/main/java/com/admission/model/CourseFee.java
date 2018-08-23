package com.admission.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="course_fee")
public class CourseFee implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String uid;
	private String ccbUid;
	private String academicYear;
	private String courseFee;
	private String hostelFee;
	private String messFee;
	@Column(name="Transportaion_fee")
	private String transportationFee;
	private String counsilingFee;
	private String cautionMoney;
	public CourseFee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CourseFee [uid=").append(uid).append(", ccbUid=").append(ccbUid).append(", academicYear=")
				.append(academicYear).append(", courseFee=").append(courseFee).append(", hostelFee=").append(hostelFee)
				.append(", messFee=").append(messFee).append(", transportationFee=").append(transportationFee)
				.append(", counsilingFee=").append(counsilingFee).append(", cautionMoney=").append(cautionMoney)
				.append(", registrationFee=").append(registrationFee).append(", other=").append(other).append("]");
		return builder.toString();
	}
	public CourseFee(String uid, String ccbUid, String academicYear, String courseFee, String hostelFee, String messFee,
			String transportationFee, String counsilingFee, String cautionMoney, String registrationFee, String other) {
		super();
		this.uid = uid;
		this.ccbUid = ccbUid;
		this.academicYear = academicYear;
		this.courseFee = courseFee;
		this.hostelFee = hostelFee;
		this.messFee = messFee;
		this.transportationFee = transportationFee;
		this.counsilingFee = counsilingFee;
		this.cautionMoney = cautionMoney;
		this.registrationFee = registrationFee;
		this.other = other;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCcbUid() {
		return ccbUid;
	}
	public void setCcbUid(String ccbUid) {
		this.ccbUid = ccbUid;
	}
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public String getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}
	public String getHostelFee() {
		return hostelFee;
	}
	public void setHostelFee(String hostelFee) {
		this.hostelFee = hostelFee;
	}
	public String getMessFee() {
		return messFee;
	}
	public void setMessFee(String messFee) {
		this.messFee = messFee;
	}
	public String getTransportationFee() {
		return transportationFee;
	}
	public void setTransportationFee(String transportationFee) {
		this.transportationFee = transportationFee;
	}
	public String getCounsilingFee() {
		return counsilingFee;
	}
	public void setCounsilingFee(String counsilingFee) {
		this.counsilingFee = counsilingFee;
	}
	public String getCautionMoney() {
		return cautionMoney;
	}
	public void setCautionMoney(String cautionMoney) {
		this.cautionMoney = cautionMoney;
	}
	public String getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(String registrationFee) {
		this.registrationFee = registrationFee;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	String registrationFee;
	String other;

}
