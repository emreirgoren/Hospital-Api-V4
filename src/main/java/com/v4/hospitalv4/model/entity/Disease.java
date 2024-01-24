package com.v4.hospitalv4.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="diseases")
@NoArgsConstructor
@AllArgsConstructor
public class Disease {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int diseaseId;

    @Column(name="disease_name")
    private String diseaseName;

    @Column(name="discription")
    private String discription;



}
