package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.repository.entities.ItemEntity;
import com.revature.repository.interfaces.ItemDaoInterface;
import com.revature.util.ConnectionFactory;

public class ItemDao implements ItemDaoInterface{

    @Override
    public void insert(ItemEntity itemEntity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ItemEntity select(int id) {
        Connection connection = ConnectionFactory.getConnection();
                // TODO Auto-generated catch block
        String sql = "SELECT * FROM item_table WHERE id=? ;";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                return new ItemEntity(
                    resultSet.getInt(1), 
                    resultSet.getInt(2), 
                    resultSet.getString(3),
                    resultSet.getInt(4));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ItemEntity> selectAll() {
        Connection connection = ConnectionFactory.getConnection();
                // TODO Auto-generated catch block
        String sql = "SELECT * FROM item_table;";

        List<ItemEntity> items = new ArrayList<>();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                items.add(new ItemEntity(
                    resultSet.getInt(1), 
                    resultSet.getInt(2), 
                    resultSet.getString(3),
                    resultSet.getInt(4)));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return items;
    }
    
}
