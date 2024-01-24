package com.v4.hospitalv4.model.dtos.diseasesDtos;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class AddDiseasePatientRequestDto {

    private String patientsName;

    private Long tcno;

    private String disease;

}
