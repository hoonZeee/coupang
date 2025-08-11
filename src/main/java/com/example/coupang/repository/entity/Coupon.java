package com.example.coupang.repository.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Coupon extends AggregateRoot{
    private Long id;
    private String name;
    private Long discountAmount;

    public long calculateDiscount(long originalPrice) {
        return Math.min(originalPrice, discountAmount);
    }
}
