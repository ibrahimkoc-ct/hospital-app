package com.ba.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import com.ba.dto.CityDTO;
import com.ba.entity.City;

@Mapper(componentModel = "spring",uses = {HospitalMapper.class})
public interface CityMapper {
	
	@Mapping(source = "hospitalDTO", target = "hospitals")
	City toEntity(CityDTO dto);

	
	@Mapping(source = "hospitals", target = "hospitalDTO")
	CityDTO toDTO(City city);
	
	List<CityDTO> toDOList(List<City> cities);
	
	List<City> toEntityList(List<CityDTO> cityDtoList);


}
