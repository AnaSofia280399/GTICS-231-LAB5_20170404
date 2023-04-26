package com.example.gtics231lab5_20170404.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeid")
    private int id;

    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String firstname;

    private String email;
    private String password;
    private int phone_number;
    private Date hiredate;

    private String job_id;

    private DecimalFormat salary;

    private DecimalFormat commision_pct;






}
