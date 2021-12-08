/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.uv.HibernateUtil;
import org.uv.data.empleado;

/**
 *
 * @author judit
 */
public class ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        empleado emple = new empleado();
        emple.setId(1);
        emple.setNombre("julia");
        emple.setTelefono("2724568957");
        
         Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        session.save(emple);
        t.commit();
        // TODO code application logic here
    }
    
}
