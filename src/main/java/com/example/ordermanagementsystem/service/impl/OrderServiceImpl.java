package com.example.ordermanagementsystem.service.impl;

import com.example.ordermanagementsystem.model.Item;
import com.example.ordermanagementsystem.model.Order;
import com.example.ordermanagementsystem.model.OrderItem;
import com.example.ordermanagementsystem.repository.OrderItemRepository;
import com.example.ordermanagementsystem.repository.OrderRepository;
import com.example.ordermanagementsystem.service.ItemService;
import com.example.ordermanagementsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ItemService itemService;

    @Autowired
    private OrderItemRepository orderItemRepository;


    public Order addOrder(Order order) {

        List<OrderItem> orderItems = order.getOrderItems();

        int totalQuantity = 0;
        double totalPrice = 0;


        for (OrderItem orderItem : orderItems) {


            Long itemId = orderItem.getItemId();
            Optional<Item> item = itemService.getItemById(itemId);

            if (item.isEmpty()) {
                throw new RuntimeException("Invalid itemId passed");
            }

            Item item1 = item.get();

            if (item1.getQuantity() < orderItem.getQuantity()) {
                throw new RuntimeException("Item out of stock");
            }

            double price = orderItem.getQuantity() * item1.getPrice();
            orderItem.setPrice(price);

            orderItemRepository.save(orderItem);

            totalPrice = totalPrice + price;
            totalQuantity = totalQuantity + orderItem.getQuantity();

        }

        order.setTotalPrice(totalPrice);
        order.setTotalQuantity(totalQuantity);

        return orderRepository.save(order);

    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(long orderId) {
        return orderRepository.findById(orderId);
    }

}
