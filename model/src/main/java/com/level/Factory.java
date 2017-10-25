package com.level;

import com.level.dao.impl.CommunDaoImpl;

public class Factory<T> {

    private static Factory instance = null;
    private static CommunDaoImpl communDao = null;

    public Factory<T> getInstance() {
        if (instance == null) instance = new Factory();
        return instance;
    }

    public CommunDaoImpl<T> getCommunDao() {
        if (communDao == null) communDao = new CommunDaoImpl();
        return communDao;
    }
}
