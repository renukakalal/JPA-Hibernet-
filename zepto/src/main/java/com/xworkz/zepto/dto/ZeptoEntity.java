package com.xworkz.zepto.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_table")
public class ZeptoEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_price")
	private double productprice;

	@Column(name = "product_discount")
	private int discount;

	public ZeptoEntity() {
		// Default constructor required by Hibernate
	}

	public ZeptoEntity(int id,String productName, double productprice, int discount) {
		super();
		this.id = id;
		this.productName = productName;
		this.productprice = productprice;
		this.discount = discount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
