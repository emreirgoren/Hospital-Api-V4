package com.v4.hospitalv4.service;

import com.v4.hospitalv4.configuration.MapperConfiguration;
import com.v4.hospitalv4.model.dtos.PatientResponseDto;
import com.v4.hospitalv4.model.dtos.diseasesDtos.AddDiseasePatientRequestDto;
import com.v4.hospitalv4.model.entity.Patient;
import com.v4.hospitalv4.repository.DiseaseRepository;
import com.v4.hospitalv4.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class DiseaseService {

    private final DiseaseRepository diseaseRepository;
    private final PatientRepository patientRepository;
    private final MapperConfiguration mapperConfiguration;
    public DiseaseService(DiseaseRepository diseaseRepository, PatientRepository patientRepository, MapperConfiguration mapperConfiguration) {
        this.diseaseRepository = diseaseRepository;
        this.patientRepository = patientRepository;
        this.mapperConfiguration = mapperConfiguration;
    }


    public PatientResponseDto addDisease(AddDiseasePatientRequestDto addDiseasePatientRequestDto) {
        Patient updatePatient = patientRepository.findByTcno(addDiseasePatientRequestDto.getTcno());
        updatePatient.setDisease(addDiseasePatientRequestDto.getDisease());
        patientRepository.save(updatePatient);
        PatientResponseDto patientResponseDto = mapperConfiguration.modelMapper().map(updatePatient,PatientResponseDto.class);
        return patientResponseDto;
    }
}
