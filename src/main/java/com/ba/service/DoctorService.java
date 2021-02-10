package com.ba.service;

import java.util.List;

import com.ba.dto.DoctorDTO;

public interface DoctorService {
	
	public void deleteDoctor(Long id);
	
	public DoctorDTO addDoctor(DoctorDTO dto);
	
	public List<DoctorDTO> allDoctor();
	
	public DoctorDTO updateDoctor(DoctorDTO dto);

}
