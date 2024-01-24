package com.v4.hospitalv4.model.dtos.patientsDtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MakePatientRequestDto {

    private String patientsName;

    private String gender;

    private String patientDepartment;

    private LocalDate dateOfBirth;

    private String diseaseHistory;

    private String prescription;

}
