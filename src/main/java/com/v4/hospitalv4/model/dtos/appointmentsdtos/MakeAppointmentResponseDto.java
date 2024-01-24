package com.v4.hospitalv4.model.dtos.appointmentsdtos;


import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class MakeAppointmentResponseDto {

    private String appointmentPatientName;

    private String appointmentPatientGender;

    private LocalDate appointmentPatientDateOfBirth;

    private LocalDate appointmentDate;

}
