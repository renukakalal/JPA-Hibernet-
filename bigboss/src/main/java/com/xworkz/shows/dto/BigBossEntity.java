package com.xworkz.shows.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bigboss_table")
public class BigBossEntity {

	@Id
	private int id;
	private String name;
	private int score;
	private double trp;
	private String host_name;
	private String lanaguge;
	private String budget;
	private int payment;
	private int months;
	private int season;

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

	public int getScore() {
		return score;
	}

	public void setScore(int i) {
		this.score = score;
	}

	public double getTrp() {
		return trp;
	}

	public void setTrp(double d) {
		this.trp = trp;
	}

	public String getHostname() {
		return host_name;
	}

	public void setHostname(String hostname) {
		this.host_name = hostname;
	}

	public String getLanaguge() {
		return lanaguge;
	}

	public void setLanaguge(String languge) {
		this.lanaguge = languge;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public String getHost_name() {
		return host_name;
	}

	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}

}
