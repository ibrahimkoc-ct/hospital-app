package com.ba.service;

import java.util.List;


import com.ba.dto.HospitalDTO;

public interface HospitalService {
	
	public void deleteHospital(Long id);
	
	public HospitalDTO addHospital(HospitalDTO dto);
	
	public HospitalDTO updateHospital(HospitalDTO dto);
	
	public HospitalDTO HospitalById(Long id);
	
	
	public List<HospitalDTO> allHospital();
	
	

}
