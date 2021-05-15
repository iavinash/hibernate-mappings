package com.learn.hbm.repository;

import com.learn.hbm.model.entity.one2many.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
