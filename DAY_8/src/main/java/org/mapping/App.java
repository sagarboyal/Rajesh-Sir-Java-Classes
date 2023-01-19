package org.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapping.hibernate.DAOConfiguration;
import org.mapping.model.Address;
import org.mapping.model.Branch;
import org.mapping.model.Student;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = DAOConfiguration.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Branch b1 = new Branch(1,"CS");
        session.save(b1);

        Address a1 = new Address("Haldia");
        session.save(a1);
        Address a2 =  new Address("Pune");
        session.save(a2);
        Student s1 = new Student(1001,"Anil",b1);
        s1.getAddresses().add(a1);
        s1.getAddresses().add(a2);
        session.save(s1);

        Address a3 = new Address("Bangalore");
        session.save(a3);
        Address a4 = new Address("Hubli");
        session.save(a4);
        Student s2 = new Student(1002,"Kiran",b1);
        s2.getAddresses().add(a3);
        s2.getAddresses().add(a4);
        session.save(s2);


        Branch b2 = new Branch(2,"EC");
        session.save(b2);

        Address a5 = new Address("Delhi");
        session.save(a5);
        Student s3 = new Student(1003,"Rakesh",b2);
        s3.getAddresses().add(a5);
        session.save(s3);
        session.getTransaction().commit();
        session.close();
    }
}
