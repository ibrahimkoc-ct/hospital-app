package com.ba.dto;


import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppointmentDTO implements Serializable{
	
	private Long id;
	private String date;
	private DoctorDTO doctorDTO;
	private PatientDTO patientDTO;
	private Long hour;



}
