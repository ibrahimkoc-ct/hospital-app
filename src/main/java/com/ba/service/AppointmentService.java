package com.ba.service;

import java.util.List;

import com.ba.dto.AppointmentDTO;
import com.ba.dto.DoctorDTO;

public interface AppointmentService {

	public void deleteAppointment(Long id);
	
	public AppointmentDTO addAppointment(AppointmentDTO dto);
	
	public List<AppointmentDTO> allAppointment();
	
	public AppointmentDTO updateAppointment(AppointmentDTO dto);
}
