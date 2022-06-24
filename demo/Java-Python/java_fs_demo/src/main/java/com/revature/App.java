package com.revature;

import com.revature.controller.ItemController;
import com.revature.repository.ItemDao;
import com.revature.repository.SupplierDao;
import com.revature.repository.entities.ItemEntity;
import com.revature.util.ConnectionFactory;

import io.javalin.Javalin;

public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create().start(9090);

        app.get("/item", ItemController.allItemsHandler);
    }
}
