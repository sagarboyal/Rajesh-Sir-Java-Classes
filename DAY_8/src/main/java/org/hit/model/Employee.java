package org.hit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    private Integer eid;
    private String ename;
    private Float salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(eid, employee.eid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid);
    }
}
