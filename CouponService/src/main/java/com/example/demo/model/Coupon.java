package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Coupon {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String code;
	private BigDecimal discount;
	private String endDate;
	
	public Coupon(long id, String code, BigDecimal discount, String endDate) {
		super();
		this.id = id;
		this.code = code;
		this.discount = discount;
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", code=" + code + ", discount=" + discount + ", endDate=" + endDate + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
