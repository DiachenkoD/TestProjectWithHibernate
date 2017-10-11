package com.level;

import com.level.dao.impl.UserDaoImpl;

public class Factory {

    private static Factory instance = null;
    private static UserDaoImpl userDao = null;

    /*public synchronized Factory<T> getInstance(){

        if (instance == null) {
            instance = new T();
        }
        return instance;


    }*/

    public static Factory getInstance() {
        if (instance == null) instance = new Factory();
        return instance;
    }

    public static UserDaoImpl getUserDao() {
        if (userDao == null) userDao = new UserDaoImpl();
        return userDao;
    }
}
