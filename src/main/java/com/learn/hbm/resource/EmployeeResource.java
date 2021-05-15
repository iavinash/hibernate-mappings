package com.learn.hbm.resource;

import com.learn.hbm.model.entity.one2one.Employee;
import com.learn.hbm.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.learn.hbm.resource.ResourceConstants.CREATE;
import static com.learn.hbm.resource.ResourceConstants.EMP;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping(EMP)
public class EmployeeResource {

    EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(CREATE)
    @ResponseStatus(CREATED)
    public Employee create(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
}
