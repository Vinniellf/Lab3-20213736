package com.example.tareagtics.Models.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer idEmployee;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false , length = 20)
    private String lastName;

    @Column(name = "email", nullable = false , length = 25)
    private String email;

/*
    // Cambiar el departamento a una relación
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;  // Relación con Department

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;*/


}
