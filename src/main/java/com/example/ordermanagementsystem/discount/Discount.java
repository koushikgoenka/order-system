package com.example.ordermanagementsystem.discount;

import org.springframework.stereotype.Component;

@Component
public interface Discount {

    public double getDiscount(double amount);
}
