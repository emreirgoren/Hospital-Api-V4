package com.v4.hospitalv4.model.dtos.patientsDtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
public class MakePatientResponseDto {

    private String patientsName;

    private String patientDepartment;

}
