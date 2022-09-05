package com.example.ordermanagementsystem.service;

import com.example.ordermanagementsystem.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    Order addOrder(Order order);

    Optional<Order> getOrderById(long orderId);

    List<Order> getAllOrders();
}
