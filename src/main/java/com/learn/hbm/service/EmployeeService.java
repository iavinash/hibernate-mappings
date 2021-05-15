package com.learn.hbm.service;

import com.learn.hbm.model.entity.one2one.Employee;
import com.learn.hbm.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee save(Employee employee){
        return employeeRepo.save(employee);
    }

}
