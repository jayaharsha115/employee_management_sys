package com.jayaharsha.employee_management_Sys.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;
    private String phone;
    private Double salary;
    private LocalDate joiningDate;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
