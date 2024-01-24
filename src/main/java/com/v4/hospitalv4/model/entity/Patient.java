package com.v4.hospitalv4.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Entity
@Table(name="patients")
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int patientId;

    @Column(name ="patient_name")
    private String patientsName;

    @Column(name="tcno")
    private Long tcno;

    @Column(name ="gender")
    private String gender;

    @Column(name="patient_department")
    private String patientDepartment;

    @Column(name ="date_of_birth")
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate dateOfBirth;

    @Column(name="disease_history")
    private String diseaseHistory;

    @Column(name ="prescription")
    private String prescription;

    @Column(name ="disease")
    private String disease;

    /*@ManyToOne
    @JoinColumn(name = "doctor_doctorName")
    private Doctor doctor;*/

}
