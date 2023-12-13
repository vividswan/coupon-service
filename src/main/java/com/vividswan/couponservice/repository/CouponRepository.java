package com.vividswan.couponservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vividswan.couponservice.domain.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
