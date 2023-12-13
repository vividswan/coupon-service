package com.vividswan.couponservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Coupon {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Getter
	private Long userId;

	public Coupon(Long userId) {
		this.userId = userId;
	}

}
