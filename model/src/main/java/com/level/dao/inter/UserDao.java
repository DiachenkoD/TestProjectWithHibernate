package com.level.dao.inter;

import java.sql.SQLException;
import com.level.entity.User;

public interface UserDao {
    public interface UserDAO {

        public void addUser(User user) throws SQLException;

        public void updateUser(User user) throws SQLException;

        public User getUserByName(String name) throws SQLException;

        public void deleteUser(User user) throws SQLException;

        public Long getUserIdByName(String name) throws SQLException;

        public User getUserById(long id) throws SQLException;
    }
}
