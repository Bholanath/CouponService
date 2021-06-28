package com.api.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.springcloud.model.Coupon;
import com.api.springcloud.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponController {
	
	@Autowired
	private CouponRepo repo;
	
	
	
	@RequestMapping(value="/coupons",method=RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {
		return repo.save(coupon);
	}
	
	@RequestMapping(value="/coupons/{code}",method=RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String coupon) {
		System.out.println("Server 2");
		return repo.findByCode(coupon);
	}

}
