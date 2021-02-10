package com.ba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ba.dto.AppointmentDTO;
import com.ba.dto.AppointmentDateDTO;
import com.ba.dto.PatientAppointment;
import com.ba.entity.Appointment;
import com.ba.mapper.AppointmentMapper;
import com.ba.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	private AppointmentRepository repository;
	
	@Autowired
	private AppointmentMapper mapper;

	@Override
	public void deleteAppointment(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public AppointmentDTO addAppointment(AppointmentDTO dto) {
		Appointment appointment=repository.save(mapper.toEntity(dto));
		dto.setId(appointment.getId());
		return dto;
	}

	@Override
	public List<AppointmentDTO> allAppointment() {
		return mapper.toDOList(repository.findAll());
	}

	@Override
	public AppointmentDTO updateAppointment(AppointmentDTO dto) {
		repository.save(mapper.toEntity(dto));
		return dto;
	}

	public List<Long> getAppointments(AppointmentDateDTO dto) {
		
		return repository.findAppointmentsDate(dto.getId(),dto.getDate());
	}

	public AppointmentDTO findByIdAppointment(Long id) {
		
		return mapper.toDTO(repository.findById(id).get());
	}
	
	public List<AppointmentDTO> findByIdPatientId(Long id) {
		
		return mapper.toDOList(repository.findByPatientId(id));
	}
	
	public List<PatientAppointment> findByIdPatientAppointment(Long id) {
		
		return repository.patientAppointmentList(id);
	}
	
	

	
	

}
