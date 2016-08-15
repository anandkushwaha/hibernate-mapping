package com.techiegoals.onetoone.app;

import org.hibernate.Session;

import com.techiegoals.onetoone.entity.UserDetails;
import com.techiegoals.onetoone.entity.Vehicle;
import com.techiegoals.util.HibernateUtil;

/**
 * App to save and retrieve data using hibernate!
 *
 */
public class App {
    public static void main(String[] args) {

        

        // creating the user object to save
        UserDetails user = new UserDetails();
        user.setUserName("Anand Kushwhaa");
        
        Vehicle veh = new Vehicle();
        veh.setVehicleName("Audi");
        
        user.setVehicle(veh);
        
     // getting session from hibernate session factory
        Session session = HibernateUtil.getSessionFactory().openSession();
        // starting new transaction
        session.beginTransaction();
        // saving the user
        session.save(user);
        // saving the vehicle
        session.save(veh);

        // committing the transaction
        session.getTransaction().commit();
    }
}
