package com.ba.service;

import java.util.List;

import com.ba.dto.PatientDTO;


public interface PatientService {
	
	public void deletePatient(Long id);
	
	public PatientDTO addPatient(PatientDTO dto);
	
	public PatientDTO updatePatient(PatientDTO dto);
	
	public List<PatientDTO> allPatient();

}
