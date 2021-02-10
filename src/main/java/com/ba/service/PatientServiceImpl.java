package com.ba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ba.dto.PatientDTO;
import com.ba.entity.Patient;
import com.ba.mapper.PatientMapper;
import com.ba.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository repository;
	
	@Autowired
	private PatientMapper mapper;

	@Override
	public void deletePatient(Long id) {
		repository.deleteById(id);
	}

	@Override
	public PatientDTO addPatient(PatientDTO dto) {
		Patient patient=repository.save(mapper.toEntity(dto));
		dto.setId(patient.getId());
		return dto;
	}

	@Override
	public PatientDTO updatePatient(PatientDTO dto) {
		repository.save(mapper.toEntity(dto));
		return dto;
	}

	@Override
	public List<PatientDTO> allPatient() {
		return mapper.toDTOList(repository.findAll());
	}

	public PatientDTO findByTcPatients(String tc) {
		
		return mapper.toDTO(repository.findByTc(tc));
	}

	public PatientDTO findById(Long id) {
			return mapper.toDTO(repository.findById(id).get());
	}
	

}
