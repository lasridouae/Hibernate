package com.gestion.etudiant.core.service;
import com.gestion.etudiant.core.models.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory ;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Users.class)
                    .addAnnotatedClass(Admin.class)
                    .addAnnotatedClass(Formateur.class)
                    .addAnnotatedClass(Apprenant.class)
                    .addAnnotatedClass(Activites.class)
                    .addAnnotatedClass(Role.class)
                    .addAnnotatedClass(Specialites.class)
                    .addAnnotatedClass(Type.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
