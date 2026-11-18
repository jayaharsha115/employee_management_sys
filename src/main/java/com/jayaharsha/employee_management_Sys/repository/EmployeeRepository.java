package com.jayaharsha.employee_management_Sys.repository;

import com.jayaharsha.employee_management_Sys.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
