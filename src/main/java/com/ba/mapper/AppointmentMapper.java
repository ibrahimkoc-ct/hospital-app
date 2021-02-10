package com.ba.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ba.dto.AppointmentDTO;
import com.ba.entity.Appointment;
@Mapper(componentModel = "spring")
public interface AppointmentMapper {
	
	@Mapping(source = "doctorDTO", target = "doctor")
	@Mapping(source = "patientDTO", target = "patient")
	Appointment toEntity(AppointmentDTO dto);

	
	@Mapping(source = "doctor", target = "doctorDTO")
	@Mapping(source = "patient", target = "patientDTO")
	AppointmentDTO toDTO(Appointment appointment);
	
	List<AppointmentDTO> toDOList(List<Appointment> appointments);
	
	List<Appointment> toEntityList(List<AppointmentDTO> dtos);

}
