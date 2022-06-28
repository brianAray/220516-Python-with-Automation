package com.revature.service;

import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.revature.models.Item;
import com.revature.models.ItemModel;
import com.revature.models.Supplier;
import com.revature.models.SupplierModel;
import com.revature.repository.ItemDao;
import com.revature.repository.entities.ItemEntity;
import com.revature.repository.entities.SupplierEntity;

public class ItemServiceTest {

    private ItemService itemService;

    @Mock
    private ItemDao mockItemDao;
    
    @Mock
    private SupplierService mockSupplierService;

    private ItemEntity dummyItem1;
    private ItemEntity dummyItem2;

    private ItemModel dummyItemModel1;
    private ItemModel dummyItemModel2;

    private Item dummyItemConvert1;
    private Item dummyItemConvert2;

    private SupplierEntity dummySupplier1;
    private SupplierEntity dummySupplier2;

    private Supplier dummySupplierConvert1;
    private Supplier dummySupplierConvert2;

    private SupplierModel dummySupplierModel1;
    private SupplierModel dummySupplierModel2;

    @BeforeClass
    public void setup(){
        MockitoAnnotations.openMocks(this);
        this.itemService = new ItemService();
        itemService.setItemDao(mockItemDao);
        itemService.setSupplierService(mockSupplierService);

        dummySupplier1 = new SupplierEntity(1, "Dummy 1", "Location 1");
        dummySupplier2 = new SupplierEntity(2, "Dummy 2", "Location 2");

        dummyItem1 = new ItemEntity(1, dummySupplier1.getId(), "Item 1", 10);
        dummyItem2 = new ItemEntity(2, dummySupplier2.getId(), "Item 2", 100);

        dummySupplierConvert1 = new Supplier(dummySupplier1.getName(), "http://localhost:9090/supplier/" + dummySupplier1.getId());
        dummySupplierConvert2 = new Supplier(dummySupplier2.getName(), "http://localhost:9090/supplier/" + dummySupplier2.getId());

        dummySupplierModel1 = new SupplierModel(dummySupplier1.getId(), dummySupplier1.getName(), dummySupplier1.getLocation(), Arrays.asList(dummyItemConvert1));
        dummySupplierModel2 = new SupplierModel(dummySupplier2.getId(), dummySupplier2.getName(), dummySupplier2.getLocation(), Arrays.asList(dummyItemConvert2));

        dummyItemConvert1 = new Item(dummyItem1.getName(), "http://localhost:9090/item/" + dummyItem1.getId());
        dummyItemConvert2 = new Item(dummyItem2.getName(), "http://localhost:9090/item/" + dummyItem2.getId());

        dummyItemModel1 = new ItemModel(dummyItem1.getId(), dummyItem1.getName(), dummyItem1.getPrice(), Arrays.asList(dummySupplierConvert1));
        dummyItemModel2 = new ItemModel(dummyItem2.getId(), dummyItem2.getName(), dummyItem2.getPrice(), Arrays.asList(dummySupplierConvert2));

        when(mockItemDao.select(dummyItem1.getId())).thenReturn(dummyItem1);
        when(mockItemDao.select(dummyItem2.getId())).thenReturn(dummyItem2);

        when(mockItemDao.selectAll()).thenReturn(Arrays.asList(dummyItem1, dummyItem2));

        when(mockSupplierService.getSupplier(dummySupplier1.getId())).thenReturn(dummySupplierModel1);
        when(mockSupplierService.getSupplier(dummySupplier2.getId())).thenReturn(dummySupplierModel2);

        when(mockSupplierService.getSupplierUrl(dummySupplier1.getId())).thenReturn(Arrays.asList(dummySupplierConvert1));
        when(mockSupplierService.getSupplierUrl(dummySupplier2.getId())).thenReturn(Arrays.asList(dummySupplierConvert2));
    }

    @Test
    void testGetAllItems() throws ItemNotFoundException {
        Assert.assertEquals(itemService.getAllItems(), Arrays.asList(dummyItemModel1, dummyItemModel2));
    }

    @Test
    void testGetItem() throws ItemNotFoundException {
        Assert.assertEquals(itemService.getItem(dummyItem1.getId()), dummyItemModel1);
    }

    @Test
    void testItemNotFoundExceptionThrownWhenInvalidItemIdProvided(){
        Assert.assertThrows(ItemNotFoundException.class, () -> itemService.getItem(-1));
    }

    @Test
    void testGetSupplierItems() {

    }
}
