package com.v4.hospitalv4.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name="doctors")
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;

    @Column(name="doctor_name")
    private String doctorName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "doctor_department")
    private String doctorDepartment;

    @Column(name = "email")
    private String email;

    @Column(name="date_of_birth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    /*@OneToMany(mappedBy = "doctor")
    private List<Patient> patients;*/





}
