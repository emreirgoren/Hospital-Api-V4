package com.v4.hospitalv4.controller;

import com.v4.hospitalv4.model.dtos.PatientResponseDto;
import com.v4.hospitalv4.model.dtos.diseasesDtos.AddDiseasePatientRequestDto;
import com.v4.hospitalv4.model.dtos.patientsDtos.MakePatientRequestDto;
import com.v4.hospitalv4.model.dtos.patientsDtos.MakePatientResponseDto;
import com.v4.hospitalv4.model.entity.Appointment;
import com.v4.hospitalv4.model.entity.Patient;
import com.v4.hospitalv4.service.AppointmentService;
import com.v4.hospitalv4.service.DiseaseService;
import com.v4.hospitalv4.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v4/doctorPage")
public class DoctorController {

    private final AppointmentService appointmentService;
    private final PatientService patientService;
    private final DiseaseService diseaseService;

    public DoctorController(AppointmentService appointmentService, PatientService patientService, DiseaseService diseaseService) {
        this.appointmentService = appointmentService;
        this.patientService = patientService;
        this.diseaseService = diseaseService;
    }

    //Randevulu Hasta Listesi
    @GetMapping("/getAppointmentList")
    public ResponseEntity<List<Appointment>> getAppointments(){
        return new ResponseEntity<>(appointmentService.getAppointments(), HttpStatus.OK);
    }

    //Serviste Yatan Hasta Listesi
    @GetMapping("/getPatientsList")
    public ResponseEntity<List<Patient>> getPatients(){
        return new ResponseEntity<>(patientService.getPatients(),HttpStatus.OK);
    }

    //Hasta Yatıs Yapma
    @PostMapping("/makePatient")
    public ResponseEntity<MakePatientResponseDto> makePatient(@RequestBody MakePatientRequestDto makePatientRequestDto){
        return new ResponseEntity<>(patientService.makePatient(makePatientRequestDto),HttpStatus.OK);
    }

    //Hastaya Hastalık Ekleme

    @PutMapping("/addDisease")
    public ResponseEntity<PatientResponseDto> addDisease(@RequestBody AddDiseasePatientRequestDto addDiseasePatientRequestDto){
        return new ResponseEntity<>(diseaseService.addDisease(addDiseasePatientRequestDto),HttpStatus.OK);
    }



}
