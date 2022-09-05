package com.example.ordermanagementsystem.repository;

import com.example.ordermanagementsystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
