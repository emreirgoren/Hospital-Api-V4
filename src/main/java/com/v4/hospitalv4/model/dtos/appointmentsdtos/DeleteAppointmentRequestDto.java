package com.v4.hospitalv4.model.dtos.appointmentsdtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteAppointmentRequestDto {

    private String appointmentPatientName;

    private Long appointmentPatientTcno;

}
