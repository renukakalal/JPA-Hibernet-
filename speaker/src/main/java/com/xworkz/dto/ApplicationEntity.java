package com.xworkz.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_table")

public class ApplicationEntity {
	
	
@Id
private int id;
private String name;
private String email;
private int marks;
private String degree;
private String branch;
private int cgpa;
private String address;
private int fees;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String string) {
	this.email = string;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getDegree() {
	return degree;
}
public void setDegree(String degree) {
	this.degree = degree;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getCgpa() {
	return cgpa;
}
public void setCgpa(int cgpa) {
	this.cgpa = cgpa;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
}

