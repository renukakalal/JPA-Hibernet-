package com.xworkz.swiggy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="swiggy_table")
public class SwiggyEntity {
	
	@Id
	private int id;
	@Column(name="food_item")
	private String fooditem;
	
	@Column(name="food_price")
	private int price;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFooditem() {
		return fooditem;
	}

	public void setFooditem(String fooditem) {
		this.fooditem = fooditem;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

}
