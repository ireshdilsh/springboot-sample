package com.iraya.iraya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iraya.iraya.entity.ItemEntity;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity,Long>{
    
}
