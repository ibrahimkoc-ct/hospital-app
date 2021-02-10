package com.ba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ba.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	Patient findByTc(String tc);

}
