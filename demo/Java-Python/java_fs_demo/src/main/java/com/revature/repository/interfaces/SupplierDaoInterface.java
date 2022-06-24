package com.revature.repository.interfaces;

import java.util.List;

import com.revature.repository.entities.SupplierEntity;

public interface SupplierDaoInterface {
    
    void insert(SupplierEntity supplierEntity);

    SupplierEntity select(int id);
    
    List<SupplierEntity> selectAll();
}
