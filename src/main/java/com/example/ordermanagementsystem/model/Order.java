package com.example.ordermanagementsystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    private int totalQuantity;

    private double totalPrice;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    public Order() {
    }

    public Order(long orderId, int totalQuantity, double totalPrice, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.totalQuantity = totalQuantity;
        this.totalPrice = totalPrice;
        this.orderItems = orderItems;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", totalQuantity=" + totalQuantity +
                ", totalPrice=" + totalPrice +
                ", orderItems=" + orderItems +
                '}';
    }
}
