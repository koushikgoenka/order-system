package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.model.Order;
import com.example.ordermanagementsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        System.out.println(order);
        Order order1 = orderService.addOrder(order);
        return order1;
    }
}
