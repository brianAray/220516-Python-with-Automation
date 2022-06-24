package com.revature.repository.interfaces;

import java.util.List;

import com.revature.repository.entities.ItemEntity;

public interface ItemDaoInterface {
    
    //CRUD
    void insert(ItemEntity itemEntity);

    ItemEntity select(int id);

    List<ItemEntity> selectAll();

    //update
    //delete
}
