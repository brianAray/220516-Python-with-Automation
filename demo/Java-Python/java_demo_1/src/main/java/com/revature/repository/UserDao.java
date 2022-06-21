package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.repository.entities.UserEntity;
import com.revature.repository.interfaces.UserDaoInterface;
import com.revature.util.ConnectionFactory;

public class UserDao implements UserDaoInterface{

    public void insertUser(UserEntity userEntity) {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "INSERT INTO user_table VALUES (default, ? , ?);";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, userEntity.getUsername());
            preparedStatement.setString(2, userEntity.getPassword());

            preparedStatement.execute();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public UserEntity selectUser(int id) {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM user_table WHERE user_id=?;";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                return new UserEntity(
                    resultSet.getInt(1), 
                    resultSet.getString(2), 
                    resultSet.getString(3));
            }

        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public UserEntity selectUser(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    public void updateUser(UserEntity updatedUserEntity) {
        // TODO Auto-generated method stub
        
    }

    public void deleteUser(int id) {
        // TODO Auto-generated method stub
        
    }

    public List<UserEntity> selectAllUsers() {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM user_table;";
        List<UserEntity> userList = new ArrayList();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                userList.add(
                    new UserEntity(
                        resultSet.getInt(1), 
                        resultSet.getString(2), 
                        resultSet.getString(3)));
            }

            return userList;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }

    }
    
}
