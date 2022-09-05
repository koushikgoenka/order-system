package com.example.ordermanagementsystem.service.impl;

import com.example.ordermanagementsystem.model.Item;
import com.example.ordermanagementsystem.repository.ItemRepository;
import com.example.ordermanagementsystem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item addItem(@RequestBody Item item){
        return itemRepository.save(item);
    }

    @Override
    public Optional<Item> getItemById(long itemId) {
        return itemRepository.findById(itemId);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }


}
