package com.iraya.iraya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iraya.iraya.entity.ItemEntity;
import com.iraya.iraya.service.ItemService;

@RestController
public class Controller {

  @Autowired
  private ItemService itemService;

  @PostMapping("/item")
  public ItemEntity createItem(@RequestBody ItemEntity itemEntity) {
      return itemService.createItem(itemEntity);
  }
  @PutMapping("/item/{id}")
  public ItemEntity updateItem(@PathVariable Long id,@RequestBody ItemEntity itemEntity) {
    return itemService.updateItem(id, itemEntity);
  }
  @GetMapping("/item(id)")
  public ItemEntity getItem(@PathVariable Long id) {
    return itemService.getItemById(id);
  }
  @GetMapping("/item")
  public  List<ItemEntity> getAllItems() {
     return itemService.getAllItems();
  }
}
