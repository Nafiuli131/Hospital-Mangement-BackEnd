package com.example.model;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "doctor_signin")
public class DoctorSign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "d_name")
    private String d_name;
    @Column(name="qualification")
    private String qualification;
    @Column(name = "specified_area")
    private String specified_area;
    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "password",nullable = false)
    private String password;

}
