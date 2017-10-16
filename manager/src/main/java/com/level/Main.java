package com.level;


import com.level.dao.impl.UserDaoImpl;
import com.level.entity.User;
import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        User u1 = new User("Physical","Vlad","Zadorojnyi",21);
        User u2 = new User("Physical","Vladimir","Nosov",22);
        User u3 = new User("Physical","Anna","Storozhko",22);
        User u4 = new User("Physical","Anastasia","Simertchuk",25);

        Factory.getInstance().getUserDao().addUser(u1);
        Factory.getInstance().getUserDao().addUser(u2);
        Factory.getInstance().getUserDao().addUser(u3);
        Factory.getInstance().getUserDao().addUser(u4);

        System.out.println(Factory.getInstance().getUserDao().getUserById(1));
    }
}
