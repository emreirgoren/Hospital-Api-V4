package com.v4.hospitalv4.model.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
public class PatientResponseDto {

    private String patientsName;

    private String gender;

    private String patientDepartment;

    private LocalDate dateOfBirth;

    private String diseaseHistory;

    private String prescription;

    private String disease;

}
