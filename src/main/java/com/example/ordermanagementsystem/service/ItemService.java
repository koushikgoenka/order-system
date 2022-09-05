package com.example.ordermanagementsystem.service;

import com.example.ordermanagementsystem.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    Item addItem(Item item);

    Optional<Item> getItemById(long itemId);

    List<Item> getAllItems();
}
