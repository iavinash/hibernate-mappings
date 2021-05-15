package com.learn.hbm.service;

import com.learn.hbm.model.entity.one2many.Student;
import com.learn.hbm.repository.StudentRepo;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student save(Student student){
        return studentRepo.save(student);
    }

}
