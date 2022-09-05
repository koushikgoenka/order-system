package com.example.ordermanagementsystem.repository;

import com.example.ordermanagementsystem.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
