package com.ba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ba.dto.ClinicDTO;
import com.ba.entity.Clinic;
import com.ba.mapper.ClinicMapper;
import com.ba.repository.ClinicRepository;

@Service
public class ClinicServiceImpl implements ClinicService{

	@Autowired
	private ClinicRepository repository;
	
	@Autowired
	private ClinicMapper mapper;

	@Override
	public ClinicDTO findbyIdClinic(Long id) {
		Clinic clinic=repository.findById(id).get();
		clinic.getPoliclinicList().forEach(item->{
			item.setDoctors(null);
		});
		
		return mapper.toDTO(clinic);
	}
}
