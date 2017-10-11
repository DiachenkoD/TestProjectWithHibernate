package com.level;


import com.level.dao.impl.UserDaoImpl;
import com.level.entity.User;
import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        User u1 = new User();
        User u2 = new User();

        u1.setName("Vasya Ivanov");
        u2.setName("Petya Ivanov");
        u1.setEmail("Alah acbar");
        u2.setEmail("Absolutely agree");

        Factory.getInstance().getUserDao().addUser(u1);
        Factory.getInstance().getUserDao().addUser(u2);

        System.out.println(Factory.getInstance().getUserDao().getUserById(1));
    }
}
