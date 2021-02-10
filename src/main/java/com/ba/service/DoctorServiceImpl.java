package com.ba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ba.dto.DoctorDTO;
import com.ba.entity.Doctor;
import com.ba.mapper.DoctorMapper;
import com.ba.repository.DoctorRepository;
import com.ba.repository.PoliclinicRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository repository;
	
	@Autowired
	private DoctorMapper mapper;
	

	@Override
	public void deleteDoctor(Long id) {
		repository.deleteById(id);		
	}

	@Override
	public DoctorDTO addDoctor(DoctorDTO dto) {
		Doctor doctor= repository.save(mapper.toEntity(dto));
		dto.setId(doctor.getId());
		return dto;
	}
	
	@Override
	public List<DoctorDTO> allDoctor() {
		return mapper.toDOList(repository.findAll());
	}

	@Override
	public DoctorDTO updateDoctor(DoctorDTO dto) {
		repository.save(mapper.toEntity(dto));
		return dto;
	}
	
	public List<DoctorDTO> policlinicIdByDoctorDTO(Long id){
		List<Doctor> doctors =repository.findPoliclinicId(id);
		doctors.forEach(item->{
			item.setAppointments(null);
		});
		return mapper.toDOList(doctors);
	}

}
