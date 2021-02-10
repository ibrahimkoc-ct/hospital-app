package com.ba.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ba.dto.PatientDTO;
import com.ba.entity.Patient;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {
	
	@Mapping(source = "appointments", target = "appointmentsDTO")
	PatientDTO toDTO(Patient patient);
	
	@Mapping(source = "appointmentsDTO", target = "appointments")
	Patient toEntity(PatientDTO dto);
	
	List<Patient> toEntityList(List<PatientDTO> dtoList);
	
	List<PatientDTO> toDTOList(List<Patient> patients);

}
