package com.gestion.etudiant.core.service;

import com.gestion.etudiant.core.models.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {

        Role role = new Role();
        Users user = new Users(1,"douae","lasri","lasridouae1@gmail.com","12345678",role);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction  = null;
        transaction = session.beginTransaction();

        session.save(user);
        transaction.commit();


    }
}
