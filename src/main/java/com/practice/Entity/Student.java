package com.practice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
    
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Fname;
	private String Mname;
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	private String lname;
	private String city;
	@Column(name = "contact")
	private int Mobileno;
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMobileno() {
		return Mobileno;
	}
	public void setMobileno(int mobileno) {
		Mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Fname=" + Fname + ", Mname=" + Mname + ", lname=" + lname + ", city=" + city
				+ ", Mobileno=" + Mobileno + ", gender=" + gender + "]";
	}
	
	
	
	
	
}
