package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.repository.entities.SupplierEntity;
import com.revature.repository.interfaces.SupplierDaoInterface;
import com.revature.util.ConnectionFactory;

public class SupplierDao implements SupplierDaoInterface{

    @Override
    public void insert(SupplierEntity supplierEntity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public SupplierEntity select(int id) {
        Connection connection = ConnectionFactory.getConnection();
                // TODO Auto-generated catch block
        String sql = "SELECT * FROM supplier_table WHERE id=? ;";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                return new SupplierEntity(
                    resultSet.getInt(1), 
                    resultSet.getString(2), 
                    resultSet.getString(3));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<SupplierEntity> selectAll() {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM supplier_table;";

        List<SupplierEntity> supplier = new ArrayList<>();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                supplier.add(new SupplierEntity(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3)
                ));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return supplier;
    }
    
}
