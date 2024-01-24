package com.v4.hospitalv4.service;

import com.v4.hospitalv4.configuration.MapperConfiguration;
import com.v4.hospitalv4.model.dtos.appointmentsdtos.*;
import com.v4.hospitalv4.model.entity.Appointment;
import com.v4.hospitalv4.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final MapperConfiguration mapperConfiguration;

    public AppointmentService(AppointmentRepository appointmentRepository, MapperConfiguration mapperConfiguration) {

        this.appointmentRepository = appointmentRepository;
        this.mapperConfiguration = mapperConfiguration;

    }

    public MakeAppointmentResponseDto makeAppointment(MakeAppointmentRequestDto makeAppointmentRequestDto) {

        Appointment appointmentRequest = mapperConfiguration.modelMapper().map(makeAppointmentRequestDto, Appointment.class);
        appointmentRepository.save(appointmentRequest);
        MakeAppointmentResponseDto appointmentResponse = mapperConfiguration.modelMapper().map(appointmentRequest, MakeAppointmentResponseDto.class);
        return appointmentResponse;

    }

    public UpdateAppointmentResponseDto updateAppointmentRequestDto(UpdateAppointmentRequestDto updateAppointmentRequestDto) {

        Appointment updateAppointment = appointmentRepository.findByAppointmentPatientTcno(updateAppointmentRequestDto.getAppointmentPatientTcno());
        updateAppointment.setAppointmentDate(updateAppointmentRequestDto.getAppointmentDate());
        appointmentRepository.save(updateAppointment);
        UpdateAppointmentResponseDto updateAppointmentResponseDto = mapperConfiguration.modelMapper().map(updateAppointment, UpdateAppointmentResponseDto.class);
        return updateAppointmentResponseDto;

    }

    public void deleteAppointment(DeleteAppointmentRequestDto deleteAppointmentRequestDto) {
        Appointment deleteAppointment = appointmentRepository.findByAppointmentPatientTcno(deleteAppointmentRequestDto.getAppointmentPatientTcno());
        appointmentRepository.delete(deleteAppointment);
    }

    public List<Appointment> getAppointments() {
        List<Appointment> appointmentList = appointmentRepository.findAll();
        return appointmentList;
    }
}
