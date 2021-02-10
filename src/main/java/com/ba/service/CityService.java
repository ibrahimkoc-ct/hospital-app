package com.ba.service;

import java.util.List;

import com.ba.dto.CityDTO;

public interface CityService {
	
	public CityDTO addCity(CityDTO dto);
	
	public CityDTO updateCity(CityDTO dto);
	
	public List<CityDTO> getAllCity();
	
	public void deleteCity(Long id);
	
	public CityDTO findById(Long id);
	

}
