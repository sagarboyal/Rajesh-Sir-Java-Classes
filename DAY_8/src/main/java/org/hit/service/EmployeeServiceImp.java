package org.hit.service;

import org.hit.model.Employee;
import org.hit.repository.EmployeeRepo;
import org.hit.repository.hibernate.EmployeeRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("employeeService")
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeRepo repository;

    @Override
    public boolean addEmployee(Employee emp) {
        if(repository.addEmployee(emp)==null)
            return false;
        else
            return true;
    }

    @Override
    public boolean updateEmployee(Employee emp) {
        if(repository.updateEmployee(emp)==null)
            return false;
        else
            return true;

    }

    @Override
    public boolean deleteEmployee(Integer pid) {
        if(repository.deleteEmployee(pid)==null)
            return false;
        else
            return true;
    }

    @Override
    public Employee findEmployee(Integer eid) {
        return repository.findEmployee(eid);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return repository.findAllEmployee();
    }
}
