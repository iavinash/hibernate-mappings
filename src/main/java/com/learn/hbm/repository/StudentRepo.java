package com.learn.hbm.repository;

import com.learn.hbm.model.entity.one2many.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
