package com.example.ordermanagementsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;

    private String name;

    private String description;

    private int quantity;

    private double price;

    public Item() {
    }

    public Item(long itemId, String name, String description, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
