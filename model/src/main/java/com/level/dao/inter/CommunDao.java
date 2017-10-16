package com.level.dao.inter;

import java.sql.SQLException;
import com.level.entity.User;

public interface CommunDao<T>{

    void addObject(T user) throws SQLException;

    void updateObject(T user) throws SQLException;

    T getObjectByName(String name) throws SQLException;

    void deleteObject(T user) throws SQLException;

    Long getObjectIdByName(String name) throws SQLException;

    T getObjectById(long id) throws SQLException;
    }
