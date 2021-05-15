package com.learn.hbm.repository;

import com.learn.hbm.model.entity.one2one.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
