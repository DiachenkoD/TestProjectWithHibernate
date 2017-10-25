package com.level.dao.impl;


import com.level.dao.inter.CommunDao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.level.HiberbateSessionFactory;

import javax.swing.*;
import java.sql.SQLException;

public class CommunDaoImpl<T> implements CommunDao<T> {

    public void addObject(T user) throws SQLException {
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

    public void updateObject(T user) {
        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            //MUST be dan
        }
    }

    public T getObjectByName(String name) {
        T user = null;
        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM User WHERE name =:paramName");
            query.setParameter("paramName", name);
            user = (T) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            //MUST be dan
        }
        return user;
    }

    public Long getObjectIdByName(String name) {
        Long idUser = null;
        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            Query query = session.createQuery("SELECT id FROM User WHERE name =:paramName");
            query.setParameter("paramName", name);
            idUser = (Long) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            //MUST be dan
        }
        return idUser;
    }

    public T getObjectById(long id) {
        T user = null;

        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            Query query = session.createQuery("FROM User WHERE id =:paramId");
            query.setParameter("paramId", id);
            user = (T) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }


    public void deleteObject(T user) {
        try (Session session = HiberbateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}