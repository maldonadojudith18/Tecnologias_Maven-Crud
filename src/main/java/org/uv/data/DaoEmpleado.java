/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.data;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.uv.HibernateUtil;

/**
 *
 * @author judit
 */
public class DaoEmpleado implements DaoGeneral<empleado>{

    @Override
    public boolean add(empleado pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        session.save(pojo);
        t.commit();
        return true;
    }

    @Override
    public boolean delete(empleado pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        session.delete(pojo);
        t.commit();
        return true;
    }

    @Override
    public boolean update(empleado pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        session.update(pojo);
        t.commit();
        return true;
    }

    @Override
    public empleado read(int id ) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        Criteria crit = session.createCriteria(empleado.class).add(Restrictions.eq("id", id));
        List result=crit.list();
        t.commit();
        
        return (empleado)result.get(0);
        
    }

    @Override
    public ArrayList<empleado> readAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        ArrayList<empleado> list = null;
        try {
            list = (ArrayList<empleado>)session.createQuery("from org.uv.data.empleado").list();
            
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        
        t.commit();
        
        
        return list;
        
    }

    
}

    
    