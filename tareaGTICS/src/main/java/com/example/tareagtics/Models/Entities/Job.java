package com.example.tareagtics.Models.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @Column(name = "job_id", nullable = false,length = 10)
    private String idJob;

    @Column(name ="job_title",nullable = false,length = 35)
    private String nombreJob;

    @Column (name = "min_salary",length = 6)
    private Integer minSalary;

    @Column (name = "max_salary",length = 6)
    private Integer maxSalary;
}
