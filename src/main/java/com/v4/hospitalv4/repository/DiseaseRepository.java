package com.v4.hospitalv4.repository;

import com.v4.hospitalv4.model.entity.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseRepository extends JpaRepository<Disease,Integer> {

}
