package com.api.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long>{

	Coupon findByCode(String coupon);

	

}
