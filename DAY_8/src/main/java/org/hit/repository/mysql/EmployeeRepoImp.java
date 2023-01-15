package org.hit.repository.mysql;

import org.hit.model.Employee;
import org.hit.repository.EmployeeRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        String query ="INSERT INTO employee VALUES(?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,e.getEid());
            ps.setString(2,e.getEname());
            ps.setFloat(3,e.getSalary());
            ps.executeUpdate();
            if(ps!=null) return e;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee e) {
        return null;
    }

    @Override
    public Employee deleteEmployee(Integer eid) {
        return null;
    }

    @Override
    public Employee findEmployee(Integer eid) {
        return null;
    }

    @Override
    public List<Employee> findAllEmployee() {
        return null;
    }
}
