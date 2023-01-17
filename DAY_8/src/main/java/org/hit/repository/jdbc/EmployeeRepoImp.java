package org.hit.repository.jdbc;

import org.hit.model.Employee;
import org.hit.repository.EmployeeRepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImp implements EmployeeRepo {
    private Connection connection = null;
    public EmployeeRepoImp() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/hitbatch4";
            String username = "batch4";
            String password = "batch1234";
            connection = DriverManager.getConnection(url,username,password);
            if(connection==null) System.out.println("Failed to connect database");
            else System.out.println("Connection successfully to the database");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Employee addEmployee(Employee e) {
        Employee emp = findEmployee(e.getEid());
        try {
            if(emp!=null)return null;
            PreparedStatement ps = connection.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
            ps.setInt(1,e.getEid());
            ps.setString(2,e.getEname());
            ps.setFloat(3,e.getSalary());
            int count = ps.executeUpdate();
            if(count>0)return e;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee e) {
        Employee emp = findEmployee(e.getEid());
        try {
            if(emp==null)return null;
            PreparedStatement ps = connection.prepareStatement("UPDATE employee SET employee_name=?, employee_salary=? WHERE employee_id=?");
            ps.setInt(3,e.getEid());
            ps.setString(1,e.getEname());
            ps.setFloat(2,e.getSalary());
            int count = ps.executeUpdate();
            if(count>0)return e;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    @Override
    public Employee deleteEmployee(Integer eid) {
        Employee emp = findEmployee(eid);
        try {
            if(emp==null)return null;
            PreparedStatement ps = connection.prepareStatement("DELETE FROM employee WHERE employee_id=?");
            int count = ps.executeUpdate();
            if(count>0)return emp;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Employee findEmployee(Integer eid) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM employee where employee_id=?");
            ps.setInt(1,eid);
            ResultSet resultSet = ps.executeQuery();
            if(resultSet.next())return new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getFloat(3));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM employee");
            while (resultSet.next())employeeList.add(new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getFloat(3)));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}
