package com.example.ordermanagementsystem.discount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("normalDiscount")
public class NormalDiscount implements Discount {
    @Override
    public double getDiscount(double amount) {
        double discountPercent = 0.1;
        double discountPrice = amount * discountPercent;
        return amount - discountPrice;
    }
}
