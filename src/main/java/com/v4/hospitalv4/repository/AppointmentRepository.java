package com.v4.hospitalv4.repository;

import com.v4.hospitalv4.model.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

    Appointment findByAppointmentPatientTcno(Long appointmentPatientTcno);

}
