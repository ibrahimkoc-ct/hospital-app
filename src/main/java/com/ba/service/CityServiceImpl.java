package com.ba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ba.dto.CityDTO;
import com.ba.entity.City;
import com.ba.mapper.CityMapper;
import com.ba.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CityRepository repository;
	
	@Autowired
	private CityMapper mapper;

	@Override
	public CityDTO addCity(CityDTO dto) {
		City city=repository.save(mapper.toEntity(dto));
		dto.setId(city.getId());
		return dto;
	}

	@Override
	public CityDTO updateCity(CityDTO dto) {
		repository.save(mapper.toEntity(dto));
		return dto;
	}

	@Override
	public List<CityDTO> getAllCity() {
		
		List<City> cities=repository.findAll();
		cities.forEach(item->{
			item.setHospitals(null);
		});
		return mapper.toDOList(cities);
	}

	@Override
	public void deleteCity(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public CityDTO findById(Long id) {
		City city=repository.findById(id).get();
		city.getHospitals().forEach(item->{
			item.setCity(null);
			item.setClinicList(null);
		});
		
		return mapper.toDTO(city);
	}
}
