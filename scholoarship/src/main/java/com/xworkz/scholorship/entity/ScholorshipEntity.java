package com.xworkz.scholorship.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "schorshiptable_details")
@NamedQuery(name="getAll",query="select rk from ScholorshipEntity rk ")
@NamedQuery(name="getById", query="select rk.name , rk.email from ScholorshipEntity rk where rk.id= :id")
@NamedQuery(name="getCountByAge",query="select count(rk) from ScholorshipEntity rk where rk.age> :age")
@NamedQuery(name = "getSingleAll", query = "select rk from ScholorshipEntity rk where rk.id= :id")
@NamedQuery(name = "getAllbyName&Email", query = "select rk from ScholorshipEntity rk where rk.name= :name and rk.email= :email")

@NamedQuery(name = "deleteByName&Age", query = "delete from ScholorshipEntity rk where rk.name= :name and rk.age= :age")

@NamedQuery(name = "update", query = "update ScholorshipEntity rk set rk.is_sanctioned = :is_sanctioned where rk.email= :email and rk.phNo= :phNo")

@NamedQuery(name = "updateByName&Email", query = "update ScholorshipEntity rk set rk.amount= :amount where rk.name= :name and rk.email= :email")
@NamedQuery(name="updateByAge&Name",query="update ScholorshipEntity rk set rk.id= :id  where rk.age= :age and rk.name= :name")


public class ScholorshipEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private int age;
	private double amount;
	private long phNo;
	 @Column(name = "date_time") 
	private LocalDate date;
	private boolean is_sanctioned;

	public ScholorshipEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public ScholorshipEntity(String name, String email, int age, double amount, long phNo, LocalDate localDate,
			boolean is_sanctioned) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.amount = amount;
		this.phNo = phNo;
		this.date = localDate;
		this.is_sanctioned = is_sanctioned;
	}

	@Override
	public String toString() {
		return "ScholorshipEntity [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", amount="
				+ amount + ", phNo=" + phNo + ", date=" + date + ", is_sanctioned=" + is_sanctioned + "]";
	}

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

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate_time(LocalDate date) {
		this.date = date;
	}

	public boolean isIs_sanctioned() {
		return is_sanctioned;
	}

	public void setIs_sanctioned(boolean is_sanctioned) {
		this.is_sanctioned = is_sanctioned;
	}

}