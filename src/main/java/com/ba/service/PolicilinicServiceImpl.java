package com.ba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ba.dto.PoliclinicDTO;
import com.ba.entity.Policlinic;
import com.ba.mapper.PoliclinicMapper;
import com.ba.repository.PoliclinicRepository;

@Service
public class PolicilinicServiceImpl implements PoliclinicService {

	
	@Autowired
	private PoliclinicRepository repository;
	
	@Autowired
	private PoliclinicMapper mapper;

	@Override
	public PoliclinicDTO findById(Long id) {
		
		return mapper.toDTO(repository.findById(id).get());
	}
	
	
}
