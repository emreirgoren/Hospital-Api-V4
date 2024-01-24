package com.v4.hospitalv4.controller;

import com.v4.hospitalv4.model.dtos.appointmentsdtos.*;
import com.v4.hospitalv4.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v4/appointmentPage")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping
    public ResponseEntity<String> homePage(){
        return new ResponseEntity<>("Home Page", HttpStatus.OK);
    }

    //Randevu Alma

    @PostMapping("/makeAppointment")
    public ResponseEntity<MakeAppointmentResponseDto> makeAppointment(@RequestBody MakeAppointmentRequestDto makeAppointmentRequestDto){
        return new ResponseEntity<>(appointmentService.makeAppointment(makeAppointmentRequestDto),HttpStatus.OK);
    }


    //Randevu Güncelleme
    @PutMapping("/updateAppointment")
    public ResponseEntity<UpdateAppointmentResponseDto> updateAppointment(@RequestBody UpdateAppointmentRequestDto updateAppointmentRequestDto){
        return new ResponseEntity<>(appointmentService.updateAppointmentRequestDto(updateAppointmentRequestDto),HttpStatus.OK);
    }




    //Randevu Silme
    @DeleteMapping("/deleteAppointment")
    public ResponseEntity<String> deleteAppointment(@RequestBody DeleteAppointmentRequestDto deleteAppointmentRequestDto){
        appointmentService.deleteAppointment(deleteAppointmentRequestDto);
        return new ResponseEntity<>("Randevu Silindi",HttpStatus.OK);
    }

}
