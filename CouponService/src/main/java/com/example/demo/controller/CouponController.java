package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coupon;
import com.example.demo.repo.CouponRepository;

@RestController
@RequestMapping("/couponapi")
public class CouponController {
	@Autowired
	private CouponRepository couponRepo;

	@PostMapping("/coupons")
	public Coupon create(@RequestBody Coupon coupon) {
		return couponRepo.save(coupon);
		
	}
	
	@GetMapping("/coupons/{code}")
	public Coupon getCoupon(@PathVariable String code) {
		
		return couponRepo.findByCode(code);
		
	}
}
