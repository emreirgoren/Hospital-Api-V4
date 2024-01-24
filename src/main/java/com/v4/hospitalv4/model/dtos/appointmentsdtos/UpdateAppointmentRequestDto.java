package com.v4.hospitalv4.model.dtos.appointmentsdtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateAppointmentRequestDto {

    private Long appointmentPatientTcno;

    private LocalDate appointmentDate;

}
