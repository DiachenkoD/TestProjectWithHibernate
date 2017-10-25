package com.level;


import com.level.entity.Image;
import com.level.entity.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        User u1 = new User("Physical","Vlad","Zadorojnyi",21);
        User u2 = new User("Physical","Vladimir","Nosov",22);
        User u3 = new User("Physical","Anna","Storozhko",22);
        User u4 = new User("Physical","Anastasia","Simertchuk",25);
        Image im1 = new Image("shit","Big shit", "Somewhere", ".png");

        Factory<User> userFactory = new Factory<User>();
        Factory<Image> imageFactory = new Factory<Image>();

        userFactory.getInstance().getCommunDao().addObject(u1);
        userFactory.getInstance().getCommunDao().addObject(u2);
        userFactory.getInstance().getCommunDao().addObject(u3);
        userFactory.getInstance().getCommunDao().addObject(u4);

        imageFactory.getInstance().getCommunDao().addObject(im1);

        System.out.println(imageFactory.getInstance().getCommunDao().getObjectById(1));
    }
}
