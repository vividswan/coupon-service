package com.vividswan.couponservice.repository;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class CouponCountRepository {

	private final RedisTemplate<String, String> redisTemplate;

	public Long increment() {
		return redisTemplate.opsForValue().increment("coupon_count");
	}

}
