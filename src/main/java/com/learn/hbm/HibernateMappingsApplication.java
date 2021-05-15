package com.learn.hbm;

import com.learn.hbm.model.entity.one2many.Student;
import com.learn.hbm.model.entity.one2many.Teacher;
import com.learn.hbm.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateMappingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateMappingsApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(StudentRepo studentRepo) {
        //ManyToOne
        return args -> {
            // create a new Teacher
            Teacher teacher = new Teacher();
            teacher.setStaffId(1220L).setFirstName("Teacher").setLastName("highland")
                    .setSalary(120000);

            // create and save new students with teacher
            studentRepo.save(new Student().setEnrollmentNo(121210145L).setFirstName("Johnny").setLastName("Deep").setTeacher(teacher));
        };
    }
}
