package com.ba.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ba.dto.HospitalDTO;
import com.ba.entity.Hospital;
import com.ba.mapper.HospitalMapper;
import com.ba.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	private HospitalRepository repository;
	
	@Autowired
	private HospitalMapper mapper;

	@Override
	public void deleteHospital(Long id) {
		repository.deleteById(id);
	
	}
	

	@Override
	public HospitalDTO addHospital(HospitalDTO dto) {
		Hospital hospital =repository.save(mapper.toEntity(dto));
		dto.setId(hospital.getId());
		return dto;
	}

	@Override
	public HospitalDTO updateHospital(HospitalDTO dto) {
		repository.save(mapper.toEntity(dto));
		return dto;
	}

	@Override
	@Cacheable(cacheNames = "allHospital")
	public List<HospitalDTO> allHospital() {
		List<Hospital> hospitals=repository.findAll();
		hospitals.forEach(item->{
			item.setClinicList(null);
			item.setCity(null);
		});
		
		return mapper.toDTOList(hospitals);
	}

	@Override
	public HospitalDTO HospitalById(Long id) {
		
		Hospital hospital=repository.findById(id).get();
		hospital.setCity(null);
		hospital.getClinicList().forEach(item->{
			item.setPoliclinicList(null);
			item.setHospital(null);
			});
		return mapper.toDTO(hospital);
	}

}
