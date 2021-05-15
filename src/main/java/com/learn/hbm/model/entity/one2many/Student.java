package com.learn.hbm.model.entity.one2many;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "STUDENT_TBL")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STD_ID")
    private Long stdId;

    @Column(name = "ENROLLMENT_NO")
    private Long enrollmentNo;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;

    public Long getStdId() {
        return stdId;
    }

    public Student setStdId(Long stdId) {
        this.stdId = stdId;
        return this;
    }

    public Long getEnrollmentNo() {
        return enrollmentNo;
    }

    public Student setEnrollmentNo(Long enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stdId.equals(student.stdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stdId);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("stdId", stdId)
                .append("enrollmentNo", enrollmentNo)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("teacher", teacher)
                .toString();
    }
}
