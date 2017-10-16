package com.level;


import com.level.entity.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        User u1 = new User("Physical","Vlad","Zadorojnyi",21);
        User u2 = new User("Physical","Vladimir","Nosov",22);
        User u3 = new User("Physical","Anna","Storozhko",22);
        User u4 = new User("Physical","Anastasia","Simertchuk",25);

        Factory.getInstance().getCommunDao().addObject(u1);
        Factory.getInstance().getCommunDao().addObject(u2);
        Factory.getInstance().getCommunDao().addObject(u3);
        Factory.getInstance().getCommunDao().addObject(u4);

        System.out.println(Factory.getInstance().getCommunDao().getObjectById(2));
    }
}
