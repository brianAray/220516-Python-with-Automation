package com.revature.controller;

import com.revature.repository.ItemDao;
import com.revature.repository.SupplierDao;
import com.revature.service.ItemNotFoundException;
import com.revature.service.ItemService;
import com.revature.service.SupplierService;

import io.javalin.http.Handler;

public class ItemController {

    private static ItemService itemService;

    public static void setItemService(ItemService itemService) {
        ItemController.itemService = itemService;
    }


    public static Handler allItemsHandler = ctx -> {
        ctx.json(itemService.getAllItems());
    };


    public static Handler getItem = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); 
        try{
            ctx.json(itemService.getItem(id));
        }catch(ItemNotFoundException e){
            ctx.result("Item Not FOund");
            ctx.status(400);
        }
    };

    
}
