package com.revature;

import com.revature.controller.ItemController;
import com.revature.controller.SupplierController;
import com.revature.repository.ItemDao;
import com.revature.repository.SupplierDao;
import com.revature.repository.entities.ItemEntity;
import com.revature.service.ItemService;
import com.revature.service.SupplierService;
import com.revature.util.ConnectionFactory;

import io.cucumber.java.bs.I;
import io.javalin.Javalin;
import io.javalin.apibuilder.ApiBuilder;

import static io.javalin.apibuilder.ApiBuilder.*;

public class App 
{
    public static void main( String[] args )
    {
        ItemDao iDao = new ItemDao();
        SupplierDao sDao = new SupplierDao();

        ItemService itemService = new ItemService();
        SupplierService supplierService = new SupplierService();

        itemService.setItemDao(iDao);
        supplierService.setSupplierDao(sDao);

        itemService.setSupplierService(supplierService);
        supplierService.setItemService(itemService);

        ItemController.setItemService(itemService);
        SupplierController.setSupplierService(supplierService);



        Javalin app = Javalin.create().start(9090);

        app.routes(() -> {
            path("item", () -> {
                get("all", ItemController.allItemsHandler);
                get("{id}", ItemController.getItem);
            });
            path("supplier", () -> {
                get("all", SupplierController.allSuppliers);
                get("{id}", SupplierController.getSupplier);
            });
        });
    }

}
