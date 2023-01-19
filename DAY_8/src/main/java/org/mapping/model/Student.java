package org.mapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {
    @Id
    private Integer studentId;
    private String studentName;

    @ManyToOne
    private Branch branch;

    @OneToMany
    private List<Address> addresses = new ArrayList<>();


    public Student(Integer studentId, String studentName, Branch branch) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.branch = branch;
    }
}
