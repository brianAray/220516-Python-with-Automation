package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Item;
import com.revature.models.ItemModel;
import com.revature.repository.ItemDao;
import com.revature.repository.entities.ItemEntity;

public class ItemService {

    private ItemDao itemDao;

    private SupplierService supplierService;

    public void setSupplierService(SupplierService supplierService){
        this.supplierService = supplierService;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public ItemModel getItem(int id) throws ItemNotFoundException {
        return convertItemModel(itemDao.select(id));
    }

    public List<ItemModel> getAllItems() throws ItemNotFoundException {
        List<ItemEntity> itemEntities = itemDao.selectAll();
        List<ItemModel> itemModels = new ArrayList<>();

        for (ItemEntity itemEntity : itemEntities){
            itemModels.add(convertItemModel(itemEntity));
        }

        return itemModels;
    }

    private ItemModel convertItemModel(ItemEntity itemEntity) throws ItemNotFoundException {
        if(itemEntity == null){
            throw new ItemNotFoundException();
        }
        return new ItemModel(
            itemEntity.getId(), 
            itemEntity.getName(), 
            itemEntity.getPrice(), 
            supplierService.getSupplierUrl(itemEntity.getSupplier_id())
            );
    }

    public List<Item> getSupplierItems(int supplierId) {
        List<ItemEntity> itemEntities = itemDao.selectAllBySupplierId(supplierId);
        List<Item> itemList = new ArrayList<>();

        for(ItemEntity itemEntity: itemEntities){
            itemList.add(convertItemUrl(itemEntity));
        }
        return itemList;
    }

    private Item convertItemUrl(ItemEntity itemEntity) {
        return new Item(
            itemEntity.getName(), 
            "http://localhost:9090/item/" + itemEntity.getId());
    }


}
