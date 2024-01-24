package com.v4.hospitalv4.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Entity
@Table(name="appointments")
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="appointment_patient_name")
    private String appointmentPatientName;

    @Column(name="appointment_patient_gender")
    private String appointmentPatientGender;

    @Column(name="appointmen_patient_dateOfBirth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate appointmentPatientDateOfBirth;

    @Column(name="appointment_patient_Tcno")
    private Long appointmentPatientTcno;

    @Column(name="appointment_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate appointmentDate;




}
