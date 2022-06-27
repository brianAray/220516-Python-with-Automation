package com.revature.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.revature.models.Supplier;
import com.revature.models.SupplierModel;
import com.revature.repository.ItemDao;
import com.revature.repository.SupplierDao;
import com.revature.repository.entities.SupplierEntity;

public class SupplierService {

    private SupplierDao supplierDao;
    private ItemService itemService;

    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    public void setSupplierDao(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    public List<Supplier> getSupplier(int supplier_id) {
        SupplierEntity supplierEntity = supplierDao.select(supplier_id);
        List<Supplier> supplierList = new ArrayList<>();
        supplierList.add(convertSupplierUrl(supplierEntity));
        return supplierList;
    }

    private Supplier convertSupplierUrl(SupplierEntity supplierEntity) {
        return new Supplier(supplierEntity.getName(), "url");
    }

    private SupplierModel convertSupplierModel(SupplierEntity supplierEntity){
        return new SupplierModel(
            supplierEntity.getId(), 
            supplierEntity.getName(), 
            supplierEntity.getLocation(),
            itemService.getSupplierItems(supplierEntity.getId()));
    }

    public List<SupplierModel> getAllSuppliers() {
        List<SupplierEntity> supplierEntities = supplierDao.selectAll();
        List<SupplierModel> supplierModels = new ArrayList<>();

        for (SupplierEntity supplierEntity: supplierEntities){
            supplierModels.add(convertSupplierModel(supplierEntity));
        }

        return supplierModels;
    }

}
