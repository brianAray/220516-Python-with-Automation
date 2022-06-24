package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.ItemModel;
import com.revature.repository.ItemDao;
import com.revature.repository.entities.ItemEntity;

public class ItemService {

    private ItemDao itemDao;
    private SupplierService supplierService;

    public ItemService(ItemDao itemDao, SupplierService suplierService){
        this.itemDao = itemDao;
        this.supplierService = suplierService;
    }

    public List<ItemModel> getAllItems() {
        List<ItemEntity> itemEntities = itemDao.selectAll();
        List<ItemModel> itemModels = new ArrayList();

        for (ItemEntity itemEntity : itemEntities){
            itemModels.add(convertItem(itemEntity));
        }

        return itemModels;
    }

    private ItemModel convertItem(ItemEntity itemEntity) {
        return new ItemModel(
            itemEntity.getId(), 
            itemEntity.getName(), 
            itemEntity.getPrice(), 
            supplierService.getSupplier(itemEntity.getSupplier_id())
            );
    }

}
