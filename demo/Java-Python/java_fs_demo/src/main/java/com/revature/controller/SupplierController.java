package com.revature.controller;

import com.revature.service.SupplierService;

import io.javalin.http.Handler;

public class SupplierController {
    
    private static SupplierService supplierService;

    public static void setSupplierService(SupplierService supplierService) {
        SupplierController.supplierService = supplierService;
    }


    public static Handler allSuppliers = ctx -> {
        ctx.json(supplierService.getAllSuppliers());
    };


    public static Handler getSupplier = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); 
        ctx.json(supplierService.getSupplier(id));
    };
}
