package com.revature.controller;

import com.revature.repository.ItemDao;
import com.revature.repository.SupplierDao;
import com.revature.service.ItemService;
import com.revature.service.SupplierService;

import io.javalin.http.Handler;

public class ItemController {

    private static ItemService itemService = new ItemService(new ItemDao(), new SupplierService(new SupplierDao()));


    public static Handler allItemsHandler = ctx -> {
        ctx.json(itemService.getAllItems());
    };
    
}
