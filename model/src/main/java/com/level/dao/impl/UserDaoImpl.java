package com.level.dao.impl;


import com.level.dao.inter.UserDao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.level.entity.User;
import com.level.HiberbateSessionFactory;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl<T> implements UserDao {

    public void addUser(User user) throws SQLException {
        Session session = null;
        try {
            session = HiberbateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
            //MUST be dan
        }finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    public void updateUser(User user) {
        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            //MUST be dan
        }
    }

    public User getUserByName(String name) {
        User user = null;
        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM User WHERE name =:paramName");
            query.setParameter("paramName", name);
            user = (User) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            //MUST be dan
        }
        return user;
    }

    public Long getUserIdByName(String name) {
        Long idUser = null;
        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            Query query = session.createQuery("SELECT idUser FROM User WHERE name =:paramName");
            query.setParameter("paramName", name);
            idUser = (Long) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            //MUST be dan
        }
        return idUser;
    }

    public User getUserById(long id) {
        User user = null;
        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM User WHERE idUser =:paramId");
            query.setParameter("paramId", id);
            user = (User) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public void deleteUser(User user) {
        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
