package org.hit.service;

import org.hit.model.Employee;

import java.util.List;

public interface EmployeeService {
    boolean addEmployee(Employee e);
    boolean updateEmployee(Employee e);
    boolean deleteEmployee(Integer eid);
    Employee findEmployee(Integer eid);
    List<Employee> findAllEmployee();
}
