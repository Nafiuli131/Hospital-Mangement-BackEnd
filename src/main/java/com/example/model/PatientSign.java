package com.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "patient_sign_in")
public class PatientSign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "p_name")
    private String pateint_name;
    @Column(name = "p_gender")
    private String patient_gender;
    @Column(name = "age")
    private String patient_age;
    @Column(name = "email",unique = true)
    private String patient_email;
    @Column(name ="p_pass",nullable = false)
    private String patient_pass;

}
