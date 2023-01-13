package org.hit.repository;

import org.hit.model.Employee;

import java.util.List;

public interface EmployeeRepo {
    Employee addEmployee(Employee e);
    Employee updateEmployee(Employee e);
    Employee deleteEmployee(Integer eid);
    Employee findEmployee(Integer eid);
    List<Employee> findAllEmployee();

}
