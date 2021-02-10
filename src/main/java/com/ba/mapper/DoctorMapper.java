package com.ba.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ba.dto.DoctorDTO;
import com.ba.entity.Doctor;


@Mapper(componentModel = "spring",uses = {AppointmentMapper.class})
public interface DoctorMapper {
	@Mapping(source = "appointmentsDTO", target = "appointments")
	@Mapping(ignore = true, target = "policlinic")
	Doctor toEntity(DoctorDTO doctorDTO);

	@Mapping(source = "appointments", target = "appointmentsDTO")
	@Mapping(ignore = true, target = "policlinic")
	DoctorDTO toDTO(Doctor doctor);
	
	List<DoctorDTO> toDOList(List<Doctor> doctors);
	
	List<Doctor> toEntityList(List<DoctorDTO> doctorDTOList);


}