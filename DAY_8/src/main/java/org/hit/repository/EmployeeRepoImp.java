package org.hit.repository;

import org.hit.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImp implements EmployeeRepo{
    ArrayList<Employee> emp = new ArrayList<>();
    @Override
    public Employee addEmployee(Employee e) {
        if(emp.contains(e))return null;
        emp.add(e);
        return e;
    }

    @Override
    public Employee updateEmployee(Employee e) {
        int index = emp.indexOf(e);
        if(index == -1)return null;
        emp.set(index,e);
        return  e;
    }

    @Override
    public Employee deleteEmployee(Integer eid) {
        int index = emp.indexOf(new Employee(eid,"",0.0f));
        if(index == -1)return null;
        return emp.remove(index);
    }

    @Override
    public Employee findEmployee(Integer eid) {
        int index = emp.indexOf(new Employee(eid,"",0.0f));
        if(index == -1)return null;
        return emp.get(index);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return emp;
    }
}
