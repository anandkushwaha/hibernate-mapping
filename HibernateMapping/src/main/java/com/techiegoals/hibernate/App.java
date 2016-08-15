package com.techiegoals.hibernate;

import org.hibernate.Session;

import com.techiegoals.entity.UserDetails;
import com.techiegoals.util.HibernateUtil;

/**
 * App to save and retrieve data using hibernate!
 *
 */
public class App {
    public static void main(String[] args) {

        // getting session from hibernate session factory
        Session session = HibernateUtil.getSessionFactory().openSession();

        // starting new transaction
        session.beginTransaction();

        // creating the user object to save
        UserDetails user = new UserDetails();
        user.setUserId(101);
        user.setUserName("Anand");

        // saving the user
        session.save(user);

        // committing the transaction
        session.getTransaction().commit();
    }
}
