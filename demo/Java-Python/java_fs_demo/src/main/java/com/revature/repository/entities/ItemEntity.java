package com.revature.repository.entities;

public class ItemEntity {
    private int id;
    private int supplier_id;
    private String name;
    private int price;
    public ItemEntity(int id, int supplier_id, String name, int price) {
        this.id = id;
        this.supplier_id = supplier_id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSupplier_id() {
        return supplier_id;
    }
    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        result = prime * result + supplier_id;
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
        ItemEntity other = (ItemEntity) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        if (supplier_id != other.supplier_id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "ItemEntity [id=" + id + ", name=" + name + ", price=" + price + ", supplier_id=" + supplier_id + "]";
    }

}
