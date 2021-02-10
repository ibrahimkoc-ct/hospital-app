package com.ba.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ba.dto.PoliclinicDTO;
import com.ba.entity.Policlinic;

@Mapper(componentModel = "spring", uses = {DoctorMapper.class})
public interface PoliclinicMapper {

	@Mapping(ignore = true,target = "clinic")
	PoliclinicDTO toDTO(Policlinic policlinic);

	@Mapping(ignore	 = true,target = "clinic")
	Policlinic toEntity(PoliclinicDTO policlinicDTO);
	
	List<Policlinic> toEntityList(List<PoliclinicDTO> dtos);
	
	List<PoliclinicDTO> toDTOList(List<Policlinic> policlinic);
}
