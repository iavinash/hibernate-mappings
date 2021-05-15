package com.learn.hbm.model.entity.one2many;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "TEACHER_TBL")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long Id;

    @Column(name = "STAFF_ID", nullable = false)
    private Long staffId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "SALARY")
    private Integer salary;

    @OneToMany(mappedBy = "teacher")
    private Set<Student> students = new HashSet<>();

    public Long getId() {
        return Id;
    }

    public Teacher setId(Long id) {
        Id = id;
        return this;
    }

    public Long getStaffId() {
        return staffId;
    }

    public Teacher setStaffId(Long staffId) {
        this.staffId = staffId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Teacher setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Teacher setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Teacher setSalary(Integer salary) {
        this.salary = salary;
        return this;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Teacher setStudents(Set<Student> students) {
        this.students = students;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return staffId.equals(teacher.staffId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId);
    }
}
