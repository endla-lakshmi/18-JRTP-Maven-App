package com.example.demo.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Serializable> {

	Coupon findByCode(String code);

}
