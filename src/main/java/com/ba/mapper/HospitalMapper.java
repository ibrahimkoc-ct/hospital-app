package com.ba.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ba.dto.HospitalDTO;
import com.ba.entity.Hospital;

@Mapper(componentModel = "spring")
public interface HospitalMapper {
	
	HospitalDTO toDTO(Hospital hospital);

	Hospital toEntity(HospitalDTO hospitalDTO);
	
	List<Hospital> toEntityList(List<HospitalDTO> dtos);
	
	List<HospitalDTO> toDTOList(List<Hospital> hospital);

}
