package com.learn.hbm.resource;

import com.learn.hbm.model.entity.one2many.Student;
import com.learn.hbm.service.StudentService;
import org.springframework.web.bind.annotation.*;

import static com.learn.hbm.resource.ResourceConstants.CREATE;
import static com.learn.hbm.resource.ResourceConstants.STD;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping(STD)
public class StudentResource {

    StudentService studentService;

    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(CREATE)
    @ResponseStatus(CREATED)
    public Student create(@RequestBody Student student){
        return studentService.save(student);
    }
}
