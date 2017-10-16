package com.level.dao.inter;

import java.sql.SQLException;
import com.level.entity.User;

public interface UserDao <T extends User>{

    void addUser(T user) throws SQLException;

    void updateUser(T user) throws SQLException;

    T getUserByName(String name) throws SQLException;

    void deleteUser(T user) throws SQLException;

    Long getUserIdByName(String name) throws SQLException;

    T getUserById(long id) throws SQLException;
    }
