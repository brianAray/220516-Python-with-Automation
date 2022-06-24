package com.revature.models;

import java.util.List;

public class ItemModel {
    private int id;
    private String item_name;
    private int price;
    private List<Supplier> supplier;
    public ItemModel(int id, String item_name, int price, List<Supplier> supplier) {
        this.id = id;
        this.item_name = item_name;
        this.price = price;
        this.supplier = supplier;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getItem_name() {
        return item_name;
    }
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public List<Supplier> getSupplier() {
        return supplier;
    }
    public void setSupplier(List<Supplier> supplier) {
        this.supplier = supplier;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
        result = prime * result + price;
        result = prime * result + ((supplier == null) ? 0 : supplier.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemModel other = (ItemModel) obj;
        if (id != other.id)
            return false;
        if (item_name == null) {
            if (other.item_name != null)
                return false;
        } else if (!item_name.equals(other.item_name))
            return false;
        if (price != other.price)
            return false;
        if (supplier == null) {
            if (other.supplier != null)
                return false;
        } else if (!supplier.equals(other.supplier))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "ItemModel [id=" + id + ", item_name=" + item_name + ", price=" + price + ", supplier=" + supplier + "]";
    }
    
}
