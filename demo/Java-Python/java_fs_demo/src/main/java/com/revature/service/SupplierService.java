package com.revature.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.revature.models.Supplier;
import com.revature.repository.SupplierDao;
import com.revature.repository.entities.SupplierEntity;

public class SupplierService {

    private SupplierDao supplierDao;

    public SupplierService(SupplierDao supplierDao){
        this.supplierDao = supplierDao;
    }

    public List<Supplier> getSupplier(int supplier_id) {
        SupplierEntity supplierEntity = supplierDao.select(supplier_id);
        List<Supplier> supplierList = new ArrayList<>();
        supplierList.add(convertSupplier(supplierEntity));
        return supplierList;
    }

    private Supplier convertSupplier(SupplierEntity supplierEntity) {
        return new Supplier(supplierEntity.getName(), "url");
    }

}
