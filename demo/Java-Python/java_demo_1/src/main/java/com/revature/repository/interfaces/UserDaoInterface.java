package com.revature.repository.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.revature.repository.entities.UserEntity;

public interface UserDaoInterface {
    
    // CRUD
    // Create
    // Read
    // Update
    // Delete

    void insertUser(UserEntity userEntity);
    UserEntity selectUser(int id);
    UserEntity selectUser(String username);
    List<UserEntity> selectAllUsers();
    void updateUser(UserEntity updatedUserEntity);
    void deleteUser(int id);

}
