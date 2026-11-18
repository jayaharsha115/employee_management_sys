package com.jayaharsha.employee_management_Sys.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "departments")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String departmentName;
    private String location;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    @JsonIgnore
    private List<Employee> employees;
}