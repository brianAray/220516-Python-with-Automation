package com.revature.repository.entities;

public class ShoppingEntity {
    private int user_id;
    private int item_id;
    public ShoppingEntity(int user_id, int item_id) {
        this.user_id = user_id;
        this.item_id = item_id;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public int getItem_id() {
        return item_id;
    }
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + item_id;
        result = prime * result + user_id;
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
        ShoppingEntity other = (ShoppingEntity) obj;
        if (item_id != other.item_id)
            return false;
        if (user_id != other.user_id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "ShoppingEntity [item_id=" + item_id + ", user_id=" + user_id + "]";
    }
    
}
