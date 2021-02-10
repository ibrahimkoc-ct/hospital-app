package com.ba.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ba.dto.ClinicDTO;
import com.ba.entity.Clinic;

@Mapper(componentModel = "spring",uses = {PoliclinicMapper.class,HospitalMapper.class})
public interface ClinicMapper {
	
	@Mapping(ignore = true,target = "hospital")
	Clinic toEntity(ClinicDTO dto);

	@Mapping(ignore = true,target = "hospital")
	ClinicDTO toDTO(Clinic clinic);
	
	List<ClinicDTO> toDTOList(List<Clinic> clinics);
	
	List<Clinic> toEntityList(List<ClinicDTO> dtos);

}
