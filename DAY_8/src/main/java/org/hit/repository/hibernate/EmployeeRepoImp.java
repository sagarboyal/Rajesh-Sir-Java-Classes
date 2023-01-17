package org.hit.repository.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hit.model.Employee;
import org.hit.repository.EmployeeRepo;

import java.util.List;

public class EmployeeRepoImp implements EmployeeRepo {
    private SessionFactory sessionFactory;
    public EmployeeRepoImp(){
        sessionFactory = DAOConfiguration.getSessionFactory();
    }
    @Override
    public Employee addEmployee(Employee e) {
        try{
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.save(e);
            session.getTransaction().commit();
            session.close();
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }
        return e;
    }

    @Override
    public Employee updateEmployee(Employee e) {
        try{
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.update(e);
            session.getTransaction().commit();
            session.close();
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }
        return e;
    }

    @Override
    public Employee deleteEmployee(Integer eid) {
        Employee emp;
        try{
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            emp = session.get(Employee.class,eid);
            session.delete(emp);
            session.getTransaction().commit();
            session.close();
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }
        return emp;
    }

    @Override
    public Employee findEmployee(Integer eid) {
        Employee emp;
        try{
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            emp = session.get(Employee.class,eid);
            session.getTransaction().commit();
            session.close();
        }catch (Exception ex){
            System.out.println(ex);
            return null;
        }
        return emp;
    }

    @Override
    public List<Employee> findAllEmployee() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Employee> list = session.createQuery("from Employee").list();
        session.close();
        return list;
    }
}
