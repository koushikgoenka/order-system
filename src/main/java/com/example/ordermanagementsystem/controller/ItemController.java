package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.model.Item;
import com.example.ordermanagementsystem.repository.ItemRepository;
import com.example.ordermanagementsystem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    private Item addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @GetMapping("/{id}")
    private Optional<Item> getItemById(@PathVariable long id){
        return itemService.getItemById(id);
    }

    @GetMapping
    private List<Item> getAllItems(){
        return itemService.getAllItems();
    }

}
