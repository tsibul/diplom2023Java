package com.factory;

import db.equipment.Imm;
import org.hibernate.Session;

public class DbFactory {

    public static void initImm (){
        /*
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Imm entity = new Imm();
//        entity.setName("Your entity name");
        session.save(entity);
        session.getTransaction().commit();
        session.close();
        
         */
    }
}
