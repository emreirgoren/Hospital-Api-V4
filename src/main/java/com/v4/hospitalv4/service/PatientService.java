package com.v4.hospitalv4.service;

import com.v4.hospitalv4.configuration.MapperConfiguration;
import com.v4.hospitalv4.model.dtos.patientsDtos.MakePatientRequestDto;
import com.v4.hospitalv4.model.dtos.patientsDtos.MakePatientResponseDto;
import com.v4.hospitalv4.model.entity.Patient;
import com.v4.hospitalv4.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;
    private final MapperConfiguration mapperConfiguration;

    public PatientService(PatientRepository patientRepository, MapperConfiguration mapperConfiguration) {
        this.patientRepository = patientRepository;
        this.mapperConfiguration = mapperConfiguration;
    }


    public List<Patient> getPatients() {
        List<Patient> patientList = patientRepository.findAll();
        return patientList;
    }

    public MakePatientResponseDto makePatient(MakePatientRequestDto makePatientRequestDto) {
        Patient makePatient = mapperConfiguration.modelMapper().map(makePatientRequestDto,Patient.class);
        patientRepository.save(makePatient);
        MakePatientResponseDto makePatientResponseDto = mapperConfiguration.modelMapper().map(makePatient,MakePatientResponseDto.class);
        return makePatientResponseDto;
    }
}
