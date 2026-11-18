package com.jayaharsha.employee_management_Sys.repository;

import com.jayaharsha.employee_management_Sys.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
