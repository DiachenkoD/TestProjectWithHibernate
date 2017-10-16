package com.level;

import com.level.dao.impl.CommunDaoImpl;

public class Factory {

    private static Factory instance = null;
    private static CommunDaoImpl communDao = null;

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

    public static CommunDaoImpl getCommunDao() {
        if (communDao == null) communDao = new CommunDaoImpl();
        return communDao;
    }
}
