package com.iraya.iraya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iraya.iraya.entity.ItemEntity;
import com.iraya.iraya.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public ItemEntity createItem(ItemEntity itemEntity) {
       return itemRepository.save(itemEntity);
    }

    @Override
    public ItemEntity getItemById(Long id) {
      return itemRepository.findById(id).orElse(null);
    }

    @Override
    public List<ItemEntity> getAllItems() {
       return itemRepository.findAll();
    }

    @Override
    public ItemEntity updateItem(Long id, ItemEntity itemEntity) {
        ItemEntity existItemEntity=itemRepository.findById(id).orElse(null);
        if (existItemEntity!=null){
            existItemEntity.setName(itemEntity.getName());
            return itemRepository.save(existItemEntity);
        }
       else {
           return null;
        }
    }
    
}
