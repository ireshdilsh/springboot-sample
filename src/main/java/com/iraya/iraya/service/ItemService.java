package com.iraya.iraya.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iraya.iraya.entity.ItemEntity;

@Service
public interface ItemService {
    ItemEntity createItem(ItemEntity itemEntity);
    ItemEntity getItemById(Long id);
    List<ItemEntity> getAllItems();
    ItemEntity updateItem(Long id,ItemEntity itemEntity);
}
