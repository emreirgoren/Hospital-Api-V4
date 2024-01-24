package com.v4.hospitalv4.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name="medicines")
@AllArgsConstructor
@NoArgsConstructor
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long medicineId;

    @Column(name="medicine_name")
    private String medicineName;

    @Column(name="company_name")
    private String companyName;

    @Column(name="manufacture_name")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate manufactureData;

    @Column(name="expiry_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate expiryDate;



}
